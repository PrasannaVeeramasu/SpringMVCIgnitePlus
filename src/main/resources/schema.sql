DROP TABLE IF  EXISTS  USER;
CREATE TABLE  USER
(
 id INT(10) NOT NULL;
 username VARCHAR(20) NULL DEFAULT  NULL;
 password VARCHAR(20) NULL DEFAULT  NULL;
 firstname VARCHAR(20) NULL DEFAULT  NULL;
 lastname VARCHAR(20) NULL DEFAULT  NULL;
 email VARCHAR(20) NULL DEFAULT  NULL;

 PRIMARY KEY(`id`)

)