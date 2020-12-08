package com.zhuanget.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author sys
 * @since 2020-12-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_event_statistic")
public class EventStatistic extends Model<EventStatistic> {

    private static final long serialVersionUID = 1L;

    /**
     * 档案编号
     */
    private String aid;

    /**
     * 抓拍时间
     */
    private String dt;

    /**
     * 摄像头ID
     */
    private Long sourceId;

    /**
     * 抓怕数量
     */
    private Integer count;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}
