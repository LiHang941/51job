/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : 51job

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-11-22 13:26:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for job
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `coid` bigint(20) DEFAULT NULL COMMENT '公司id',
  `cddr` varchar(255) DEFAULT NULL COMMENT '公司地点',
  `coname` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `cotype` varchar(255) DEFAULT NULL COMMENT '公司类型',
  `jobid` bigint(20) DEFAULT NULL COMMENT '工作id',
  `jobarea` varchar(255) DEFAULT NULL COMMENT '工作区域位置',
  `jobinfo` varchar(2048) DEFAULT NULL COMMENT '工作需求信息',
  `jobname` varchar(255) DEFAULT NULL COMMENT '工作名称',
  `jobtype` varchar(255) DEFAULT NULL COMMENT '工作类型',
  `degree` varchar(255) DEFAULT NULL COMMENT '要求学历',
  `workyear` varchar(255) DEFAULT NULL COMMENT '工作经验',
  `providesalary` varchar(255) DEFAULT NULL COMMENT '工资预计',
  `lastupdate` timestamp NULL DEFAULT NULL COMMENT '最后更新时间',
  `issuedate` timestamp NULL DEFAULT NULL COMMENT '发行日期',
  `isintern` int(11) DEFAULT NULL COMMENT '是否是实习',
  `iscommunicate` int(11) DEFAULT NULL COMMENT '是否沟通？没看懂什么意思....',
  `isurgency` int(11) DEFAULT NULL COMMENT '是否紧急',
  `istop` int(11) DEFAULT NULL COMMENT '是否置顶',
  `insert_flag_uuid` varchar(50) DEFAULT NULL COMMENT '插入分类,不用理会',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for position
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `position_name` varchar(1024) DEFAULT NULL COMMENT '职位名称',
  `job_details_url` varchar(255) DEFAULT NULL COMMENT '工作细节url地址',
  `company_name` varchar(1024) DEFAULT NULL COMMENT '公司名称',
  `working_place` varchar(255) DEFAULT NULL COMMENT '工作地点',
  `salary` varchar(255) DEFAULT NULL COMMENT '工资',
  `release_ime` date DEFAULT NULL COMMENT '发布时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `all_positions_url` varchar(255) DEFAULT NULL COMMENT '该公司的所有职位介绍',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
