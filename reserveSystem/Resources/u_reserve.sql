/*
 Navicat Premium Data Transfer

 Source Server         : root
 Source Server Type    : MySQL
 Source Server Version : 80035
 Source Host           : localhost:3306
 Source Schema         : u_reserve

 Target Server Type    : MySQL
 Target Server Version : 80035
 File Encoding         : 65001

 Date: 09/01/2024 17:47:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for house
-- ----------------------------
DROP TABLE IF EXISTS `house`;
CREATE TABLE `house`  (
  `hId` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `jId` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `hClass` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `hTime` date NULL DEFAULT NULL,
  `hMoney` decimal(10, 2) NULL DEFAULT NULL,
  `hStatus` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`hId`, `jId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of house
-- ----------------------------
INSERT INTO `house` VALUES ('1', '1', 'OHdIx4BQ5b', '2011-09-12', 476.15, 'eDlzgInlPx');
INSERT INTO `house` VALUES ('10', '10', 'SERPH6M9QV', '2000-11-10', 197.69, 'yACkteuT7A');
INSERT INTO `house` VALUES ('100', '100', 'gIl1vbvtvO', '2001-02-26', 37.95, 'cBpMHjXSxb');
INSERT INTO `house` VALUES ('1000', '1000', 'S25SJouzPx', '2000-09-13', 577.60, 'aS8ZY3drAJ');

-- ----------------------------
-- Table structure for jiudian
-- ----------------------------
DROP TABLE IF EXISTS `jiudian`;
CREATE TABLE `jiudian`  (
  `jId` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `jName` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `jAddress` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `jLevel` int NULL DEFAULT NULL,
  `jIntroduction` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `bId` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `jNumber` int NULL DEFAULT NULL,
  PRIMARY KEY (`jId`, `bId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of jiudian
-- ----------------------------
INSERT INTO `jiudian` VALUES ('1', '民宿之家', 'No.928, Dongsan Road, Erxianqiao, Chenghua District', 5, 'HgoveBZPV8', 'jack', 375);
INSERT INTO `jiudian` VALUES ('10', '民宿2', '4-9-20 Kamihigashi, Hirano Ward', 5, 'CQJK5dUFxQ', 'jack', 982);
INSERT INTO `jiudian` VALUES ('100', '广东民宿', 'No.680, Dongsan Road, Erxianqiao, Chenghua District', 6, 'U7lfJawYcU', 'lily', 575);
INSERT INTO `jiudian` VALUES ('1000', '四川民宿', '342 Maddox Street', 4, 'AHwPRe8mIz', 'lily', 286);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order`  (
  `oId` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `uId` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `jId` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `hId` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `oTime` date NULL DEFAULT NULL,
  `oMoney` decimal(10, 2) NULL DEFAULT NULL,
  `oStatus` int NULL DEFAULT NULL,
  `oEvaluate` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`oId`, `uId`, `jId`, `hId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('11111', 'user', '1', '1', '2013-08-13', 98.93, 0, '6LffUfkG8q');
INSERT INTO `order` VALUES ('22222', '6', '10', '10', '2016-04-27', 897.27, 0, 'ePCWSNb20s');
INSERT INTO `order` VALUES ('33333', '7', '100', '100', '2013-11-28', 157.18, 0, 'MTvxPqWZDj');
INSERT INTO `order` VALUES ('44444', '8', '1000', '1000', '2001-04-05', 128.08, 0, 'MOjfjtTgtA');
INSERT INTO `order` VALUES ('55555', '9', '1', '1', '2006-01-30', 666.14, 1, 'Q8CBE1x8O2');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uId` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `uName` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `uPwd` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `uPhone` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `uNumber` varchar(32) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `uSex` int NULL DEFAULT NULL,
  `uAuthority` int NULL DEFAULT NULL,
  `uStatus` int NULL DEFAULT NULL,
  PRIMARY KEY (`uId`, `uPwd`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('10', 'Matsumoto Aoshi', '12345', '(151) 739 7355', 'Vn0FEFRnQk', 0, 2, 1);
INSERT INTO `user` VALUES ('6', 'Kono Riku', '12345', '5182 871027', 'nI4BguNhyq', 1, 3, 0);
INSERT INTO `user` VALUES ('7', 'Dale Ross', '12345', '5540 283904', 'LcZrbGOs3O', 1, 3, 0);
INSERT INTO `user` VALUES ('8', 'Gao Zitao', '12345', '614-809-2040', '3c2zJcMdwe', 0, 3, 0);
INSERT INTO `user` VALUES ('9', 'Sakurai Daichi', '12345', '11-927-8104', 'u65P2Dk5Sb', 1, 3, 0);
INSERT INTO `user` VALUES ('admin', 'Xiao Xiuying', '12345', '157-2859-2609', 'Ht3E1LZfex', 0, 1, 0);
INSERT INTO `user` VALUES ('jack', 'Yung Yu Ling', '12345', '3-2630-2093', 'bAjg1VSJNN', 1, 2, 0);
INSERT INTO `user` VALUES ('lily', 'Wu Zhiyuan', '12345', '11-499-6403', 'gk8KuWXtMV', 0, 2, 0);
INSERT INTO `user` VALUES ('shangjia', 'Yokoyama Sara', '12345', '212-042-3746', 'WiuLsocYUk', 0, 2, 0);
INSERT INTO `user` VALUES ('user', 'Shibata Miu', '12345', '213-955-5454', '4QnfrCTUSE', 1, 3, 0);

SET FOREIGN_KEY_CHECKS = 1;
