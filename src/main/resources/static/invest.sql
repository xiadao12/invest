DROP DATABASE IF EXISTS invest;

CREATE DATABASE invest;

USE invest;
/*外汇表*/
CREATE TABLE `fx`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fxpre` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `fxback` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `platform` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `main` tinyint(1) NOT NULL DEFAULT 0,
  `webinvesting` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fx
-- ----------------------------
INSERT INTO `fx` VALUES (1, '	AUD	', '	CAD	', '	[	iqoption	,	binary	]	', 0, 47);
INSERT INTO `fx` VALUES (2, '	AUD	', '	CHF	', '	[	iqoption	,	binary	]	', 0, 48);
INSERT INTO `fx` VALUES (3, '	AUD	', '	JPY	', '	[	iqoption	,	binary	]	', 1, 49);
INSERT INTO `fx` VALUES (4, '	AUD	', '	NZD	', '	[	iqoption	,	binary	]	', 0, 50);
INSERT INTO `fx` VALUES (5, '	AUD	', '	USD	', '	[	iqoption	,	binary	]	', 1, 5);
INSERT INTO `fx` VALUES (6, '	CAD	', '	CHF	', '	[	iqoption			]	', 0, 14);
INSERT INTO `fx` VALUES (7, '	EUR	', '	AUD	', '	[	iqoption	,	binary	]	', 1, 15);
INSERT INTO `fx` VALUES (8, '	EUR	', '	CAD	', '	[	iqoption	,	binary	]	', 1, 16);
INSERT INTO `fx` VALUES (9, '	EUR	', '	CHF	', '	[	iqoption	,	binary	]	', 1, 10);
INSERT INTO `fx` VALUES (10, '	EUR	', '	GBP	', '	[	iqoption	,	binary	]	', 1, 6);
INSERT INTO `fx` VALUES (11, '	EUR	', '	JPY	', '	[	iqoption	,	binary	]	', 1, 9);
INSERT INTO `fx` VALUES (12, '	EUR	', '	NZD	', '	[	iqoption	,	binary	]	', 0, 52);
INSERT INTO `fx` VALUES (13, '	EUR	', '	USD	', '	[	iqoption	,	binary	]	', 1, 1);
INSERT INTO `fx` VALUES (14, '	GBP	', '	AUD	', '	[	iqoption	,	binary	]	', 1, 53);
INSERT INTO `fx` VALUES (15, '	GBP	', '	CAD	', '	[	iqoption	,	binary	]	', 0, 54);
INSERT INTO `fx` VALUES (16, '	GBP	', '	CHF	', '	[	iqoption	,	binary	]	', 0, 12);
INSERT INTO `fx` VALUES (17, '	GBP	', '	JPY	', '	[			binary	]	', 1, 11);
INSERT INTO `fx` VALUES (18, '	GBP	', '	NOK	', '	[			binary	]	', 0, 93);
INSERT INTO `fx` VALUES (19, '	GBP	', '	NZD	', '	[	iqoption	,	binary	]	', 0, 55);
INSERT INTO `fx` VALUES (20, '	GBP	', '	USD	', '	[	iqoption	,	binary	]	', 1, 2);
INSERT INTO `fx` VALUES (21, '	NZD	', '	JPY	', '	[			binary	]	', 0, 58);
INSERT INTO `fx` VALUES (22, '	NZD	', '	USD	', '	[	iqoption	,	binary	]	', 0, 8);
INSERT INTO `fx` VALUES (23, '	USD	', '	CAD	', '	[	iqoption	,	binary	]	', 1, 7);
INSERT INTO `fx` VALUES (24, '	USD	', '	CHF	', '	[	iqoption	,	binary	]	', 1, 4);
INSERT INTO `fx` VALUES (25, '	USD	', '	HKP	', '	[	iqoption			]	', 0, NULL);
INSERT INTO `fx` VALUES (26, '	USD	', '	INR	', '	[	iqoption			]	', 0, 160);
INSERT INTO `fx` VALUES (27, '	USD	', '	JPY	', '	[			binary	]	', 1, 3);
INSERT INTO `fx` VALUES (28, '	USD	', '	MXN	', '	[			binary	]	', 0, 39);
INSERT INTO `fx` VALUES (29, '	USD	', '	NOK	', '	[	iqoption	,	binary	]	', 0, 59);
INSERT INTO `fx` VALUES (30, '	USD	', '	PLN	', '	[			binary	]	', 0, 40);
INSERT INTO `fx` VALUES (31, '	USD	', '	SEK	', '	[			binary	]	', 0, 41);
INSERT INTO `fx` VALUES (32, '	USD	', '	SGD	', '	[	iqoption			]	', 0, 42);
INSERT INTO `fx` VALUES (33, '	USD	', '	ZAR	', '	[	iqoption			]	', 0, 17);