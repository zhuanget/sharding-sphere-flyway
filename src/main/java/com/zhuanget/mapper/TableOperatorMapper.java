package com.zhuanget.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhuanget.entity.EventStatistic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Zhuang_ET
 * @since 2020-12-08 15:24:48
 */
@Mapper
public interface TableOperatorMapper extends BaseMapper<EventStatistic> {

    List<String> getAllSubTable(@Param("tableName") String tableName);
}
