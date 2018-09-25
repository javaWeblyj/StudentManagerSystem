# Host: 127.0.0.1  (Version: 5.7.19-log)
# Date: 2018-07-16 17:39:47
# Generator: MySQL-Front 5.3  (Build 4.269)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "stu_class"
#

CREATE TABLE `stu_class` (
  `class_id` int(11) NOT NULL,
  `class_name` varchar(100) DEFAULT NULL,
  `class_introduce` text,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='班级表';

#
# Data for table "stu_class"
#

INSERT INTO `stu_class` VALUES (2015250601,'15软件工程1班','这是华南农业大学数学与信息学院（软件学院）15级软件工程一班，是一个非常棒的集体。');

#
# Structure for table "student"
#

CREATE TABLE `student` (
  `stu_id` varchar(50) NOT NULL,
  `c_id` int(11) DEFAULT NULL,
  `stu_name` varchar(50) DEFAULT NULL,
  `stu_age` int(11) DEFAULT NULL,
  `stu_sex` varchar(5) DEFAULT NULL,
  `stu_address` text,
  `stu_status` tinyint(1) DEFAULT '1' COMMENT '用户类型(1：可以查询，0：不可以查询)',
  PRIMARY KEY (`stu_id`),
  KEY `FK_Reference_1` (`c_id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`c_id`) REFERENCES `stu_class` (`class_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生表';

#
# Data for table "student"
#

INSERT INTO `student` VALUES ('201525060113',2015250601,'梁永健',18,'男','华山区16栋304.',1);

#
# Structure for table "sys_manager"
#

CREATE TABLE `sys_manager` (
  `man_id` varchar(50) NOT NULL,
  `man_psd` varchar(32) DEFAULT NULL,
  `man_name` varchar(32) DEFAULT NULL,
  `man_login` datetime DEFAULT NULL,
  PRIMARY KEY (`man_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员表';

#
# Data for table "sys_manager"
#

INSERT INTO `sys_manager` VALUES ('201525060113','201525060113','梁永健','2018-07-16 17:37:24'),('201525060114','201525060114','林杰','2018-07-16 17:26:25'),('201525060118','201525060118','刘东恒','2018-07-16 17:37:40');
