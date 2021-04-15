import numpy as np
import pandas as pd
import math
import operator
from scipy import spatial

ratings = pd.read_csv("ml-data/u.data", sep="\t", names=['user_id','movie_id','rating'], usecols=range(3))
users = pd.read_csv("ml-data/u.user", sep="|", names=['user_id'], usecols=range(1))
movies = pd.read_csv("ml-data/u.item", sep="|", names=['movie_id','movie_name'], usecols=range(2))

userRatings = dict()

for index, row in users.iterrows():
    userRatings[row['user_id']] = {}

for index, row in ratings.iterrows():
    userRatings[row['user_id']][row['movie_id']] = row['rating']

def recomendacionUsuarioPelicula(user,i):
    sumSimilitudes = 0
    for index, row in users.iterrows():
        sumSimilitudes += abs(user[row['user_id']])
    c = 1 / sumSimilitudes

    valoracion = 0
    for index, row in users.iterrows():
        if i in userRatings[row['user_id']]:
            valoracion += user[row['user_id']]*userRatings[row['user_id']][i]

    valoracionFinal = c * valoracion

    return valoracionFinal

user = dict()
file = open("tablaSimilitud.txt")
id = 1
for line in file:
    v = line.split(",")
    for rating in v:
        user[id] = float(rating)
        id = id + 1

peliculasVisualizadas = []
file = open("peliculasVisualizadas.txt")
for line in file:
    v = line.split(",")
    for pelicula in v:
        peliculasVisualizadas.append(pelicula)


recomendaciones = []
for index, row in movies.iterrows():
    recomendaciones.append({'id' : row['movie_id'], 'movie' : row['movie_name'], 'rating': recomendacionUsuarioPelicula(user, row['movie_id'])})

recomendacionesOrdenadas = sorted(recomendaciones, key=lambda k: float(k['rating']), reverse = True)

recomendacionesFinales = []
added = 0
for i in range(30):
    add = True
    for pelicula in peliculasVisualizadas:
        if(pelicula == recomendacionesOrdenadas[i]['movie']):
            add = False
    if(add & (added < 7)):
        recomendacionesFinales.append(recomendacionesOrdenadas[i]['movie'])
        added = added + 1

# Calculo de similitud teniendo como referencia una película
movieProperties = ratings.groupby('movie_id').agg({'rating': [np.size, np.mean]})

movieNumRatings = pd.DataFrame(movieProperties['rating']['size'])
movieNormalizedNumRatings = movieNumRatings.apply(lambda x: (x - np.min(x)) / (np.max(x) - np.min(x)))

movieDict = {}
with open('ml-data/u.item', encoding="ISO-8859-1") as f:
    temp = ''
    for line in f:
        fields = line.rstrip('\n').split('|')
        movieID = int(fields[0])
        name = fields[1]
        genres = fields[5:25]
        genres = map(int, genres)
        movieDict[movieID] = (name, np.array(list(genres)), movieNormalizedNumRatings.loc[movieID].get('size'), movieProperties.loc[movieID].rating.get('mean'))

def ComputeDistance(a, b):
    genresA = a[1]
    genresB = b[1]
    genreDistance = spatial.distance.cosine(genresA, genresB)
    popularityA = a[2]
    popularityB = b[2]
    popularityDistance = abs(popularityA - popularityB)
    return genreDistance + popularityDistance

def getNeighbors(movieID, K):
    distances = []
    for movie in movieDict:
        if (movie != movieID):
            dist = ComputeDistance(movieDict[movieID], movieDict[movie])
            distances.append((movie, dist))
    distances.sort(key=operator.itemgetter(1))
    neighbors = []
    for x in range(K):
        neighbors.append(distances[x][0])
    return neighbors

K = 10
avgRating = 0

neighbors = getNeighbors(recomendacionesOrdenadas[0]['id'], K) # Toy Story (1995)
added = 0
for neighbor in neighbors:
    add = True
    for pelicula in peliculasVisualizadas:
        if(str(movieDict[neighbor][0]) == pelicula):
            add = False
    for recomendacionFinal in recomendacionesFinales:
        if(str(movieDict[neighbor][0]) == recomendacionFinal):
            add = False
    if(add & (added < 2)):
        recomendacionesFinales.append(str(movieDict[neighbor][0]))
        added = added + 1

neighbors = getNeighbors(recomendacionesOrdenadas[1]['id'], K) # Toy Story (1995)
added = 0
for neighbor in neighbors:
    add = True
    for pelicula in peliculasVisualizadas:
        if(str(movieDict[neighbor][0]) == pelicula):
            add = False
    for recomendacionFinal in recomendacionesFinales:
        if(str(movieDict[neighbor][0]) == recomendacionFinal):
            add = False
    if(add & (added < 1)):
        recomendacionesFinales.append(str(movieDict[neighbor][0]))
        added = added + 1

for i in range(len(recomendacionesFinales)):
    print(str(i+1) + ': ' + recomendacionesFinales[i])
