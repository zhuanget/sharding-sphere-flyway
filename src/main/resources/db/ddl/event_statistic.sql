CREATE TABLE `t_event_statistic` (
  `aid` varchar(64) NOT NULL COMMENT '档案编号',
  `dt` varchar(30) DEFAULT NULL COMMENT '抓拍时间',
  `source_id` bigint(20) DEFAULT NULL COMMENT '摄像头ID',
  `count` int(11) DEFAULT NULL COMMENT '抓怕数量',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  KEY `idx_aid` (`aid`) USING BTREE,
  KEY `idx_source_id` (`source_id`) USING BTREE,
  KEY `idx_dt_source_id` (`dt`,`source_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;