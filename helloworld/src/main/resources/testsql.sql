-- mysql数据库脚本
create schema school_db;

use school_db;

CREATE TABLE `ts_student`(
student_id INT PRIMARY KEY NOT NULL auto_increment,-- 主键id
name varchar(50) NOT NULL, -- 姓名
age int NOT NULL, -- 年龄
gender boolean NOT NULL, -- 性别
create_time datetime NOT NULL -- 创建时间
) ;

INSERT INTO `ts_student`(`name`,`age`,`gender`,`create_time`) VALUES ('聂小倩',17,0,now());
INSERT INTO `ts_student`(`name`,`age`,`gender`,`create_time`) VALUES ('宁采臣',18,1,now());
INSERT INTO `ts_student`(`name`,`age`,`gender`,`create_time`) VALUES ('燕赤侠',19,1,now());
INSERT INTO `ts_student`(`name`,`age`,`gender`,`create_time`) VALUES ('黑山老妖',20,0,now());

SELECT * FROM ts_student

SET SQL_SAFE_UPDATES = 0;


CREATE TABLE `ts_order`(
id INT PRIMARY KEY NOT NULL auto_increment,-- 主键id
student_id varchar(50) NOT NULL, -- 订单名称
name varchar(50) NOT NULL, -- 订单名称
address varchar(50) NOT NULL, -- 配送地址
create_time datetime NOT NULL -- 创建时间
) ;

INSERT INTO `ts_order`(`student_id`,`name`,`address`,`create_time`) VALUES (1,'订单a','黑山口村a',now());
INSERT INTO `ts_order`(`student_id`,`name`,`address`,`create_time`) VALUES (1,'订单b','黑山口村b',now());
INSERT INTO `ts_order`(`student_id`,`name`,`address`,`create_time`) VALUES (3,'订单c','黑山口村c',now());
INSERT INTO `ts_order`(`student_id`,`name`,`address`,`create_time`) VALUES (3,'订单d','黑山口村d',now());










