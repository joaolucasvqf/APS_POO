﻿-- Database: "APS_POO"

-- DROP DATABASE "APS_POO";

CREATE DATABASE "APS_POO"
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'Portuguese_Brazil.1252'
       LC_CTYPE = 'Portuguese_Brazil.1252'
       CONNECTION LIMIT = -1;


CREATE TABLE CAD_SIMULACAO(
	IDSIMULACAO INTEGER,
	NUMPESSOAS  INTEGER,
	NUMPRATOS   INTEGER,
	NUMSALADAS  INTEGER,
	NUMCARBOIDRATOS INTEGER,
	NUMPROTEINAS    INTEGER,
	NUMSUCOS        INTEGER,
	TEMPO_MIN_ALIMENTACAO INTEGER,
	TEMPO_MAX_ALIMENTACAO INTEGER,
	PRIMARY KEY(IDSIMULACAO)
)
GO
CREATE TABLE RESULT_SIMULACAO (
	IDRESULTADO    INTEGER,
	TOT_MIN_TEMPO  INTEGER,
	TOT_MAX_TEMPO  INTEGER,
	PRIMARY KEY(IDRESULTADO)
)
GO
COMMIT