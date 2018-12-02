DROP DATABASE IF EXISTS invest;

CREATE DATABASE invest;

USE invest;
/*外汇表*/
CREATE TABLE `fx` (
	`id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
	`fxpre` VARCHAR ( 255 ) NOT NULL,
	`fxback` VARCHAR ( 255 ) NOT NULL,
	`platform` VARCHAR ( 255 ) DEFAULT NULL,
	`main` BIGINT ( 1 ) NOT NULL DEFAULT '0',
PRIMARY KEY ( `id` )
);

INSERT INTO fx ( fxpre, fxback, platform, main )
VALUES
	( "	AUD	", "	CAD	", "	[	iqoption	,	binary	]	", 0 ),
	( "	AUD	", "	CHF	", "	[	iqoption	,	binary	]	", 0 ),
	( "	AUD	", "	JPY	", "	[	iqoption	,	binary	]	", 1 ),
	( "	AUD	", "	NZD	", "	[	iqoption	,	binary	]	", 0 ),
	( "	AUD	", "	USD	", "	[	iqoption	,	binary	]	", 1 ),
	( "	CAD	", "	CHF	", "	[	iqoption			]	", 0 ),
	( "	EUR	", "	AUD	", "	[	iqoption	,	binary	]	", 1 ),
	( "	EUR	", "	CAD	", "	[	iqoption	,	binary	]	", 1 ),
	( "	EUR	", "	CHF	", "	[	iqoption	,	binary	]	", 1 ),
	( "	EUR	", "	GBP	", "	[	iqoption	,	binary	]	", 1 ),
	( "	EUR	", "	JPY	", "	[	iqoption	,	binary	]	", 1 ),
	( "	EUR	", "	NZD	", "	[	iqoption	,	binary	]	", 0 ),
	( "	EUR	", "	USD	", "	[	iqoption	,	binary	]	", 1 ),
	( "	GBP	", "	AUD	", "	[	iqoption	,	binary	]	", 1 ),
	( "	GBP	", "	CAD	", "	[	iqoption	,	binary	]	", 0 ),
	( "	GBP	", "	CHF	", "	[	iqoption	,	binary	]	", 0 ),
	( "	GBP	", "	JPY	", "	[			binary	]	", 1 ),
	( "	GBP	", "	NOK	", "	[			binary	]	", 0 ),
	( "	GBP	", "	NZD	", "	[	iqoption	,	binary	]	", 0 ),
	( "	GBP	", "	USD	", "	[	iqoption	,	binary	]	", 1 ),
	( "	NZD	", "	JPY	", "	[			binary	]	", 0 ),
	( "	NZD	", "	USD	", "	[	iqoption	,	binary	]	", 0 ),
	( "	USD	", "	CAD	", "	[	iqoption	,	binary	]	", 1 ),
	( "	USD	", "	CHF	", "	[	iqoption	,	binary	]	", 1 ),
	( "	USD	", "	HKP	", "	[	iqoption			]	", 0 ),
	( "	USD	", "	INR	", "	[	iqoption			]	", 0 ),
	( "	USD	", "	JPY	", "	[			binary	]	", 1 ),
	( "	USD	", "	MXN	", "	[			binary	]	", 0 ),
	( "	USD	", "	NOK	", "	[	iqoption	,	binary	]	", 0 ),
	( "	USD	", "	PLN	", "	[			binary	]	", 0 ),
	( "	USD	", "	SEK	", "	[			binary	]	", 0 ),
	( "	USD	", "	SGD	", "	[	iqoption			]	", 0 ),
	( "	USD	", "	ZAR	", "	[	iqoption			]	", 0 )