create database portal;

use portal;


create table Account(account_id int primary key auto_increment,firstname varchar(20) not null,lastname varchar(20) not null,email varchar(50) not null unique,mobile varchar(10) not null unique,username varchar(20) not null unique,role varchar(10) not null,password varchar(10) not null);

desc Account;


