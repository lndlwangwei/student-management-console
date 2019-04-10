-- auto-generated definition
create table user
(
  id        int                       not null
    primary key auto_increment,
  name varchar(30)          not     null,
  age int not null,
  gender    varchar(10) default 'male' null,
  card_id  varchar(64)   default     null COMMENT '身份证编号',
  hometown varchar(512) ,
  create_time datetime not null ,
  update_time datetime not null
);

create index name
  on user (name);

create table clazz
(
  id int not null primary key auto_increment,
  name varchar(50),
  create_time datetime not null,
  update_time datetime not null
);