CREATE DATABASE 3d_pc_2311;
USE 3d_pc_2311;

CREATE TABLE Usuario(
id int primary key auto_increment,
nome varchar (45) not null,
login varchar (10) not null,
senha varchar (10) not null,
status bool not null);

CREATE TABLE Editora(
id int primary key auto_increment,
nome varchar (45) not null,
cidade varchar (45) not null,
uf varchar (2) not null,
endereco_completo varchar (60) not null);

CREATE TABLE Livro(
id int primary key auto_increment,
titulo varchar (45) not null,
autor varchar (45) not null,
num_paginas int not null,
preco float not null,
editora_id int not null,
FOREIGN KEY(editora_id) REFERENCES editora (id));

INSERT INTO Usuario VALUES (null, "Vitor Bueno", "admin", "1234", 0);
INSERT INTO Usuario VALUES (null, "Aluno", "aluno", "1234", 0);