/*
 * 실행시키기 전, 데이터베이스에 테이블  만들기
 * Database: MySQL
 * SCHEMA 명 : note
 * TABLE 명 : member
 */

DROP SCHEMA IF EXISTS `note` ;
CREATE SCHEMA IF NOT EXISTS `note` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `note` ;

DROP TABLE IF EXISTS `note`.`MEMBER` ;

CREATE TABLE `note`.`MEMBER` (
  `MEMBER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `MEMBER_EMAIL` varchar(255) NOT NULL,
  `MEMBER_NAME` varchar(255) NOT NULL,
  `MEMBER_PHONE` varchar(255) NOT NULL,
  PRIMARY KEY (`MEMBER_ID`)
) 
ENGINE=InnoDB;

insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member01','(02) 123-4567', 'member01@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member02','(02) 123-4567', 'member02@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member03','(02) 123-4567', 'member03@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member04','(02) 123-4567', 'member04@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member05','(02) 123-4567', 'member05@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member06','(02) 123-4567', 'member06@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member07','(02) 123-4567', 'member07@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member08','(02) 123-4567', 'member08@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member09','(02) 123-4567', 'member09@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member10','(02) 123-4567', 'member10@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member11','(02) 123-4567', 'member11@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member12','(02) 123-4567', 'member12@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member13','(02) 123-4567', 'member13@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member14','(02) 123-4567', 'member14@jsnote.com');
insert into `note`.`MEMBER` (MEMBER_NAME, MEMBER_PHONE, MEMBER_EMAIL) values ('Member15','(02) 123-4567', 'member15@jsnote.com');