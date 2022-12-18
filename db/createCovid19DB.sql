CREATE DATABASE IF NOT EXISTS `covid19`;
USE `covid19`;

create table by_countries
(
    id              int auto_increment
        primary key,
    key_id          tinytext not null,
    country         tinytext not null,
    country_code    tinytext not null,
    slug            tinytext not null,
    new_confirmed   int      not null,
    total_confirmed int      not null,
    new_deaths      int      not null,
    total_deaths    int      not null,
    new_recovered   int      null,
    total_recovered int      not null,
    date_time       datetime not null,
    constraint by_countries_id_uindex
        unique (id)
);