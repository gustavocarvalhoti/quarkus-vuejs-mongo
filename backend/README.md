# treinaquarkus-mongo-basico

## Project start
```
cd backend
./mvnw compile quarkus:dev
```

### Creating the Mongo database
```
docker pull mongo
docker run --name mongodb mongo <- (Usar o de baixo)
docker run -d -p 27017-27019:27017-27019 --name mongodb mongo <- (Usar esse)
docker exec -it mongodb bash <- (Entrar no banco)
```

### Testing the Mongo database
```
mongo
show dbs
use thepolyglotdeveloper
db.people.save({ firstname: "Gustavo", lastname: "Silva" })
db.people.find()
db.people.find({ firstname: "Gustavo" })
...