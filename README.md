# testando-quarkus-padtec
# Comandos Docker Mongo
docker pull mongo <br/>
docker run --name mongodb mongo <- Usar o de baixo <br/>
docker run -d -p 27017-27019:27017-27019 --name mongodb mongo <br/>
docker exec -it mongo-db bash <br/>

# Comandos $mongo - Testando SQL
show dbs <br/>
use thepolyglotdeveloper <br/>
db.people.save({ firstname: "Gustavo", lastname: "Silva" }) <br/>
db.people.find() <br/>
db.people.find({ firstname: "Gustavo" }) <br/>
