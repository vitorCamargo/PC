CREATE DATABASE bdPokemonGO;
USE bdPokemonGO;

CREATE TABLE Jogador(
id int primary key auto_increment,
nome varchar(45) not null,
idade int not null,
pais varchar(45) not null);

CREATE TABLE Pokemon(
id int primary key auto_increment,
nome varchar(45) not null,
tipo varchar(10) not null);

CREATE TABLE Lista_pokemon(
id int primary key auto_increment,
apelido varchar(45) not null,
hp int not null,
candy int not null,
cp int not null,
jogador_id int not null,
pokemon_id int not null,
FOREIGN KEY(jogador_id) REFERENCES jogador (id),
FOREIGN KEY(pokemon_id) REFERENCES pokemon (id));