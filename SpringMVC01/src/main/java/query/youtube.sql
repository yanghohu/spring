create table teatehouse(
 num int primary key auto_increment, 
 id varchar(20) not null,
 area varchar(10) not null,
 urllink varchar(100) not NULL, 
 unique key(id)
);