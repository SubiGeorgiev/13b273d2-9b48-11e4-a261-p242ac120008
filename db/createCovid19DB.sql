CREATE DATABASE IF NOT EXISTS `covid19`;
USE `covid19`;

create table patients
(
    id              int auto_increment
        primary key,
    new_confirmed   int      not null,
    total_confirmed int      not null,
    new_dead        int      not null,
    total_dead      int      not null,
    new_recovered   int      not null,
    total_recovered int      not null,
    date_time       datetime not null,
    constraint patients_id_uindex
        unique (id)
);