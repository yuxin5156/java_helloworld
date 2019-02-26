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