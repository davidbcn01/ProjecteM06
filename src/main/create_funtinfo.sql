CREATE TABLE jugador(
	idCarta 		  INTEGER NOT NULL ,
	idJugador 		  INTEGER NOT NULL ,
	idEquipo  	  	  INTEGER NOT NULL ,
	nombre      		  VARCHAR(50) NOT NULL,
  	apellidos   		  VARCHAR(50) NOT NULL,
  	nacionalidad		  VARCHAR(50) NOT NULL,
  	fechaNacimiento 	  DATE,

CONSTRAINT pk_idJugador PRIMARY KEY(idJugador),
CONSTRAINT fk_idJugador FOREIGN KEY(idJugador) REFERENCES estadisticas(idJugador),
CONSTRAINT fk_idEquipo  FOREIGN KEY(idEquipo) REFERENCES equipo(idEquipo),
CONSTRAINT fk_idCarta  FOREIGN KEY(idCarta) REFERENCES carta(idCarta)
  );

CREATE TABLE equipo
  (
  nombre      	VARCHAR(50),
  liga        	VARCHAR(50),
  idEquipo    	INTEGER NOT NULL,
  CONSTRAINT pk_equipo PRIMARY KEY (idequipo),
  );

CREATE TABLE carta
 (
 nombreTipo    		VARCHAR(50) NOT NULL,
 fechaLanzamiento  	DATE,
 idCarta       		INTEGER NOT NULL,
 CONSTRAINT pk_carta PRIMARY KEY (idCarta)
 );
 
CREATE TABLE estadisticas
(
	idJugador        	INTEGER NOT NULL ,
	valoracion 		INTEGER NOT NULL ,
	ritmo            	INTEGER NOT NULL ,
	tiro  		  	INTEGER NOT NULL ,
	pase  		  	INTEGER NOT NULL ,
	regate           	INTEGER NOT NULL ,
	defensa 		INTEGER NOT NULL ,
	fisico  		INTEGER NOT NULL ,
	estiloQuimica  	  	VARCHAR(50) default 'basico',
	filigranas   	  	INTEGER NOT NULL ,
	piernaMala 		INTEGER NOT NULL ,
	piernaBuena      	VARCHAR(50) NOT NULL,

CONSTRAINT fk_estadisticas FOREIGN KEY(idJugador) REFERENCES jugador(idJugador),
CONSTRAINT pk_idJugadorStats PRIMARY KEY(idJugador),
CONSTRAINT ck_piernaBuena CHECK ( piernaBuena IN('Derecha','Izquierda')),
CONSTRAINT ck_valoracion CHECK (valoracion  > 10),
CONSTRAINT ck_ritmo CHECK (ritmo > 10),
CONSTRAINT ck_tiro CHECK (tiro   > 10),
CONSTRAINT ck_pase CHECK (pase   > 10),
CONSTRAINT ck_regate CHECK (regate  > 10),
CONSTRAINT ck_defensa CHECK (defensa   > 10),
CONSTRAINT ck_fisico CHECK (fisico   > 10),
CONSTRAINT ck_filigranas CHECK (filigranas    >= 1),
CONSTRAINT ck_piernaMala CHECK (piernaMala    >= 1)
 );
