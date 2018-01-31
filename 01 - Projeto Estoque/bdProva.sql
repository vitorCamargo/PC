CREATE DATABASE bd_prova;
USE bd_prova;

CREATE TABLE Produto(
idProduto int primary key auto_increment not null,
nome varchar(45) not null,
marca varchar(45) not null,
estoque int not null,
preco float not null);