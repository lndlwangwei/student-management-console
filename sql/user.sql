-- auto-generated definition
create table user
(
  id        int                       not null
    primary key,
  user_name varchar(30)               null,
  password  varchar(64)               null,
  gender    varchar(10) default 'man' null
);

create index user_name
  on user (user_name);