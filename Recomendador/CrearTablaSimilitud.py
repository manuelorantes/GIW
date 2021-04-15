import numpy as np
import pandas as pd
import math
import random

ratings = pd.read_csv("ml-data/u.data", sep="\t", names=['user_id','movie_id','rating'], usecols=range(3))
users = pd.read_csv("ml-data/u.user", sep="|", names=['user_id'], usecols=range(1))
movies = pd.read_csv("ml-data/u.item", sep="|", names=['movie_id','movie_name'], usecols=range(2))

userRatings = dict()

movieIds = np.arange(1, 1683)
random.shuffle(movieIds)

userRatings['nuevo usuario'] = {}

peliculasVisualizadas = ''
for i in range(20):
    for index, row in movies.iterrows():
        if(row['movie_id'] == movieIds[i]):
            print(row['movie_name'])
            userRatings['nuevo usuario'][row['movie_id']] = int(input('¿Con cuantos puntos (de 1 a 5) puntuas a esta película? '))
            peliculasVisualizadas = peliculasVisualizadas + row['movie_name'] + ','

peliculasVisualizadas = peliculasVisualizadas[:-1]

text_file = open("peliculasVisualizadas.txt", "w")
text_file.write(peliculasVisualizadas)
text_file.close()


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

    if (total_u != 0) & (total_v != 0):
        final = total / (math.sqrt(total_u) * math.sqrt(total_v))
    else:
        final = 0
    return final

tablaSimilitud = {}
for index, row in users.iterrows():
    tablaSimilitud[row['user_id']] = similitudCoseno('nuevo usuario', row['user_id'])

csv = '';
for index, row in users.iterrows():
    csv = csv + str(tablaSimilitud[row['user_id']]) + ','

csv = csv[:-1]

text_file = open("tablaSimilitud.txt", "w")
text_file.write(csv)
text_file.close()
