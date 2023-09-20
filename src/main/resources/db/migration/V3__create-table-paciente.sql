CREATE TABLE paciente
(
    id          bigint       not null auto_increment,
    nombre      varchar(100) not null,
    email       varchar(100) not null,
    telefono    varchar(20)  not null,
    calle       varchar(100) not null,
    distrito    varchar(100) not null,
    ciudad      varchar(100) not null,
    numero      varchar(20),
    complemento varchar(100),

    primary key (id)
);