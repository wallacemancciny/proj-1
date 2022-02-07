  drop database eavaliacao;
  create database eavaliacao;
  use eavaliacao;

  create table escola
  (
      id int primary key auto_increment,
      nome varchar(50)not null
  );

  create table aluno
  (
      id int primary key auto_increment,
      nome varchar(50)not null
  );

  create table disciplina
  (
      id int primary key auto_increment,
      nome varchar(50)not null,
      ativo boolean not null
  );

  create table avaliacao
  (
      id int primary key auto_increment,
      data date not null,
      id_aluno int,
      id_disciplina int,
      id_escola int
  );

  insert into escola (nome) values('ITA');

  insert into escola (nome) values('AFA');

  insert into aluno (nome) values ('adam');

  insert into disciplina values (null, 'calculo 1', true);

  insert into avaliacao values (1, '04-02-2022', 1, 1, 1);
