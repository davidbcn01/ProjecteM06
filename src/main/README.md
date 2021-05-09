IMPORTANTE: en el fichero application propperties estan los datos de nuestra base de datos, modificar si es debido
IMPORTANTE: No conseguimos arreglar el error del post mediante el comando curl, no estamos seguros si el put funciona

/api/equipo

POST application/json

curl -X POST -d '{"key1":"value1", "key2":"value2"}' -H "Content-Type: application/json" http://localhost:8080/equipo

GET application/json

curl http://localhost:8080/equipo

PUT application/json

curl -X PUT -H "Content-Type: application/json" -d '{"nombre":"Barcelona","liga":"Liga Española"}' http://localhost:8080/equipo/id_equipo_que_se_quiera_modificar

DELETE application/json
curl -X DELETE http://localhost:8080/equipo/id_equipo_que_se_quiera_borrar

/api/carta

POST application/json

curl -X POST -d '{"key1":"value1", "key2":"value2"}' -H "Content-Type: application/json" http://localhost:8080/carta

GET application/json

curl http://localhost:8080/carta

PUT application/json

curl -X PUT -H "Content-Type: application/json" -d '{"nombretipo":"Oro basico","fechalanzamiento":"2020-08-04"}' http://localhost:8080/carta/id_carta_que_se_quiera_modificar

DELETE application/json
curl -X DELETE http://localhost:8080/carta/id_carta_que_se_quiera_borrar




/api/jugador

POST application/json

curl -X POST -d '{"key1":"value1", "key2":"value2"}' -H "Content-Type: application/json" http://localhost:8080/jugador

GET application/json

curl http://localhost:8080/jugador

PUT application/json

curl -X PUT -H "Content-Type: application/json" -d '{"apellidos":"Messi","Nacionalidad":"España"}' http://localhost:8080/jugador/id_jugador_que_se_quiera_modificar

DELETE application/json
curl -X DELETE http://localhost:8080/jugador/id_jugador_que_se_quiera_borrar



/api/estadisticas

POST application/json

curl -X POST -d '{"key1":"value1", "key2":"value2"}' -H "Content-Type: application/json" http://localhost:8080/estadisticas

GET application/json

curl http://localhost:8080/estadisticas

PUT application/json

curl -X PUT -H "Content-Type: application/json" -d '{"ritmo":"93","tiro":"60"}' http://localhost:8080/estadisticas/id_jugador_que_se_quiera_modificar_las_estadisticas

DELETE application/json
curl -X DELETE http://localhost:8080/estadisticas/id_jugador_que_se_quiera_borrar_las_estadisticas
