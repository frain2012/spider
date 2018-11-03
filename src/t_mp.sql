/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : spider

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2018-09-05 17:52:39
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_mp
-- ----------------------------
DROP TABLE IF EXISTS `t_mp`;
CREATE TABLE `t_mp` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `link` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `title` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `mark` varchar(300) COLLATE utf8mb4_bin DEFAULT NULL,
  `content` text COLLATE utf8mb4_bin,
  `createtime` datetime DEFAULT NULL,
  `label` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '标签',
  `mp_name` varchar(125) COLLATE utf8mb4_bin DEFAULT NULL,
  `mp_history` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `images` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of t_mp
-- ----------------------------

-- ----------------------------
-- Table structure for t_mp_conf
-- ----------------------------
DROP TABLE IF EXISTS `t_mp_conf`;
CREATE TABLE `t_mp_conf` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `url` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `page_url` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL,
  `main_condition` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '条件',
  `detail_condition` varchar(255) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '详情条件',
  `type` tinyint(2) DEFAULT NULL COMMENT '1->mp,2->电影',
  `label` varchar(30) COLLATE utf8mb4_bin DEFAULT NULL,
  `cron` varchar(125) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of t_mp_conf
-- ----------------------------
INSERT INTO `t_mp_conf` VALUES ('1', 'http://weixin.sogou.com/pcindex/pc/pc_16/pc_16.html', 'http://weixin.sogou.com/pcindex/pc/pc_16/{}.html', null, null, '1', '星座', null);
