-- mysql数据库脚本
create schema school_db;

use school_db;

CREATE TABLE `ts_student`(
student_id varchar(50) PRIMARY KEY NOT NULL,-- 主键id
name varchar(50) NOT NULL, -- 姓名
age int NOT NULL, -- 年龄
gender boolean NOT NULL, -- 性别
create_time datetime NOT NULL -- 创建时间
) 

-- 插入数据
INSERT INTO ts_student VALUES('1','宁采臣',16,1,now());
INSERT INTO ts_student VALUES('2','小倩',17,1,now());
INSERT INTO ts_student VALUES('3','黑山老妖',18,1,now());
INSERT INTO ts_student VALUES('4','燕赤侠',19,1,now());


SET SQL_SAFE_UPDATES = 0;



