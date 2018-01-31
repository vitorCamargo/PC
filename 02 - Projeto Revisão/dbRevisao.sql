CREATE DATABASE revisao;
USE revisao;

CREATE TABLE Marca(
id int(11) not null primary key auto_increment,
nome varchar(45) not null);

CREATE TABLE Produto(
id int(11) not null primary key auto_increment,
nome varchar(45) not null,
preco float not null,
estoque int(11) not null,
marca_id int(11) not null);

ALTER TABLE Produto ADD KEY fk_produto_marca_idx(marca_id);
ALTER TABLE Produto ADD CONSTRAINT fk_produto_marca FOREIGN KEY (marca_id) REFERENCES marca(id) ON DELETE NO ACTION;