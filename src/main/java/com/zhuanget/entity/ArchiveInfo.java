package com.zhuanget.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 档案信息表
 * </p>
 *
 * @author sys
 * @since 2020-12-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_archive_info")
public class ArchiveInfo extends Model<ArchiveInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 人员档案ID【编号】
     */
    private String aid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证
     */
    private String cid;

    /**
     * 出生年月
     */
    private LocalDate birthday;

    /**
     * 性别(1-男， 2-女, 0-未知)
     */
    private Integer gender;

    /**
     * 年龄: 0 未知 （备注：只是作为一种参考值）
     */
    private Integer age;

    /**
     * 档案户籍所在地
     */
    private String residenceAddr;

    /**
     * 居住地
     */
    private String currAddr;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 手机mac地址
     */
    private String phoneMac;

    /**
     * 交通工具
     */
    private String transportation;

    /**
     * 交通卡
     */
    private String transportationCard;

    /**
     * 最近抓拍时间
     */
    private LocalDateTime recentSnapTime;

    /**
     * 抓拍照片数
     */
    private Integer imageCount;

    /**
     * 头像地址
     */
    private String avatarUrl;

    /**
     * 算法版本
     */
    private Integer algoVersion;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime modifyTime;

    /**
     * 是否删除(0-未删除，1-已删除)
     */
    private Integer isDeleted;

    /**
     * 档案来源
     */
    private String sourceType;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
