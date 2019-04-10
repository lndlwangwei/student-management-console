-- auto-generated definition
create table user
(
  id        int                       not null
    primary key auto_increment,
  user_name varchar(30)               null,
  password  varchar(64)               null,
  gender    varchar(10) default 'male' null,
  create_time datetime not null ,
  update_time datetime not null
);

create index user_name
  on user (user_name);

create table clazz
(
  id int not null primary key auto_increment,
  name varchar(50),
  create_time datetime not null,
  update_time datetime not null
);