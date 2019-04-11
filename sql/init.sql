-- auto-generated definition
create table user
(
  id        int                       not null
    primary key auto_increment,
  name varchar(30)          not     null,
  age int not null,
  gender    varchar(10) default 'male' null,
  card_id  varchar(64)   default     null COMMENT '身份证编号',
  hometown varchar(512) comment '籍贯',
  nation varchar(20) comment '民族',
  contact varchar(50) comment '联系方式',
  emergency_contact varchar(50) comment '紧急联系方式',
  graduate_school varchar(1024) comment '毕业院校',
  graduate_time varchar(125) comment '毕业时间',
  specialty varchar(512) comment '专业',
  score text comment '历次考试成绩',
  dormitory text comment '宿舍',
  source text comment '学生来源',
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