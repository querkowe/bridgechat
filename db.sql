create database bridgechat;
use bridgechat;

create table chat_user(
						num long auto_increment primary key
						,id varchar(20) unique not null
                        ,pw varchar(100) not null
                        ,name varchar(30) not null unique
                        ,email varchar(50) not null
                        ,access_token varchar(100)
                        ,refresh_token varchar(100)
                        );