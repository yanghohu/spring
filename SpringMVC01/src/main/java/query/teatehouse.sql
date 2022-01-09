create table teatehouse(
 num int primary key auto_increment,  
 title VARCHAR(50) not NULL,
 area varchar(100) not null,
 tel  VARCHAR(20) NOT NULL,
 holiday varchar(50) not null,
 urllink varchar(100) not NULL, 
 unique key(num)
);