CREATE DATABASE dbAulaLogin;
USE dbAulaLogin;

CREATE TABLE Usuario(
id int primary key auto_increment,
nome varchar(45) not null,
login varchar(10) not null,
senha varchar(10) not null,
bloqueado bool not null);

CREATE TABLE marca(
id int primary key auto_increment,
nome varchar(30) not null);

CREATE TABLE produto(
id int primary key auto_increment,
nome varchar(30) not null,
descricao text not null,
preco float not null,
lucro float not null,
estoque int not null,
marca_id int,
FOREIGN KEY(marca_id) REFERENCES marca(id));

CREATE TABLE cliente(
id int primary key auto_increment,
nome varchar(45) not null,
idade int not null,
renda float not null,
endereco varchar(50) not null,
cidade varchar(40) not null,
uf varchar(2) not null);

INSERT INTO Usuario VALUES (null, "Vitor Bueno", "admin", "1234", 0);
INSERT INTO Usuario VALUES (null, "Aluno", "aluno", "1234", 0);