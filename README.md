# testando-quarkus-padtec (Ubuntu)

## Config project
```
###install docker 
https://docs.docker.com/install/linux/docker-ce/ubuntu/
Não esquecer esse -> sudo usermod -aG docker your-user-here

###install maven 
sudo apt-get install maven
mvn -v

###install mongo
docker pull mongo
docker run -d -p 27017-27019:27017-27019 --name mongodb mongo
docker exec -it mongo-db bash <- Acessar o container
```

## Comandos Mongo - Testando SQL
```
mongo
show dbs 
use thepolyglotdeveloper
db.people.save({ firstname: "Gustavo", lastname: "Silva" })
db.people.find()
db.people.find({ firstname: "Gustavo" })
```

## Starting project
```
Frontend - Ler o README.md do frontend 
Backend  - Ler o README.md do backend
sudo netstat -tlpn | grep 5005  <- The Walkind Dead Port
kill -9 'process'
```
