import numpy as np
import pandas as pd
import math

ratings = pd.read_csv("ml-data/u.data", sep="\t", names=['user_id','movie_id','rating'], usecols=range(3))
users = pd.read_csv("ml-data/u.user", sep="|", names=['user_id'], usecols=range(1))
movies = pd.read_csv("ml-data/u.item", sep="|", names=['movie_id'], usecols=range(1))

userRatings = dict()

for index, row in users.iterrows():
    userRatings[row['user_id']] = {}

for index, row in ratings.iterrows():
    userRatings[row['user_id']][row['movie_id']] = row['rating']

def similitudCoseno(u,v):
    total = 0
    total_u = 0
    total_v = 0
    for index, row in movies.iterrows():
        if row['movie_id'] in userRatings[u]:
            if row['movie_id'] in userRatings[v]:
                total += userRatings[u][row['movie_id']] * userRatings[v][row['movie_id']]
                total_u += userRatings[u][row['movie_id']] * userRatings[u][row['movie_id']]
                total_v += userRatings[v][row['movie_id']] * userRatings[v][row['movie_id']]

    if total_u != 0:
        final = total / (math.sqrt(total_u) * math.sqrt(total_v))
    else:
        final = 0
    return final

def recomendacionUsuarioPelicula(u,i):
    sumSimilitudes = 0
    for index, row in users.iterrows():
        if row['user_id'] != u:
            sumSimilitudes += abs(similitudCoseno(u, row['user_id']))
    c = 1 / sumSimilitudes

    valoracion = 0
    for index, row in users.iterrows():
        if i in userRatings[row['user_id']]:
            if row['user_id'] != u:
                valoracion += similitudCoseno(u, row['user_id'])*userRatings[row['user_id']][i]

    valoracionFinal = c * valoracion

    return valoracionFinal


print(recomendacionUsuarioPelicula(1, 678))
print(recomendacionUsuarioPelicula(1, 679))
print(recomendacionUsuarioPelicula(1, 680))
print(recomendacionUsuarioPelicula(1, 681))





#Calculo de similitud teniendo como referencia una película
# movieProperties = ratings.groupby('movie_id').agg({'rating': [np.size, np.mean]})
#
# movieNumRatings = pd.DataFrame(movieProperties['rating']['size'])
# movieNormalizedNumRatings = movieNumRatings.apply(lambda x: (x - np.min(x)) / (np.max(x) - np.min(x)))
#
# movieDict = {}
# with open('ml-data/u.item', encoding="ISO-8859-1") as f:
#     temp = ''
#     for line in f:
#         #line.encode().decode("ISO-8859-1")
#         fields = line.rstrip('\n').split('|')
#         movieID = int(fields[0])
#         name = fields[1]
#         genres = fields[5:25]
#         genres = map(int, genres)
#         movieDict[movieID] = (name, np.array(list(genres)), movieNormalizedNumRatings.loc[movieID].get('size'), movieProperties.loc[movieID].rating.get('mean'))
#
# # print(movieNormalizedNumRatings.head(10))
#
# print(movieDict[1])
#
# from scipy import spatial
#
# def ComputeDistance(a, b):
#     genresA = a[1]
#     genresB = b[1]
#     genreDistance = spatial.distance.cosine(genresA, genresB)
#     popularityA = a[2]
#     popularityB = b[2]
#     popularityDistance = abs(popularityA - popularityB)
#     return genreDistance + popularityDistance
#
# print(ComputeDistance(movieDict[1], movieDict[4]))
#
#
# import operator
#
# def getNeighbors(movieID, K):
#     distances = []
#     for movie in movieDict:
#         if (movie != movieID):
#             dist = ComputeDistance(movieDict[movieID], movieDict[movie])
#             distances.append((movie, dist))
#     distances.sort(key=operator.itemgetter(1))
#     neighbors = []
#     for x in range(K):
#         neighbors.append(distances[x][0])
#     return neighbors
#
# K = 10
# avgRating = 0
#
# print(movieDict[1], '\n')
# neighbors = getNeighbors(1, K) # Toy Story (1995)
# for neighbor in neighbors:
#     avgRating += movieDict[neighbor][3]
#     print (movieDict[neighbor][0] + " " + str(movieDict[neighbor][3]))
#
# avgRating /= K
