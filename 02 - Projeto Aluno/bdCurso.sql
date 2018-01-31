CREATE DATABASE bdCurso;
USE bdCurso;

CREATE TABLE Aluno(
id int primary key auto_increment,
nome varchar(40) not null,
idade int not null,
curso varchar(30) not null,
renda float,
ano_cadastro int not null);