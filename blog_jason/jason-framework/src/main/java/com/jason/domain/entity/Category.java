package com.jason.domain.entity;

import java.util.Date;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 分类表(Category)表实体类
 *
 * @author makejava
 * @since 2023-12-04 16:47:07
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("sg_category")
public class Category {
    @TableId
    private Long id;
    //分类名private String name;
//父分类id，如果没有父分类为-1private Long pid;
//描述private String description;
//状态0:正常,1禁用private String status;
    private String name;
    private Long pid;
    private String description;
    private String status;
    private Long createBy;
    private Date createTime;
    private Long updateBy;
    private Date updateTime;
//删除标志（0代表未删除，1代表已删除）private Integer delFlag;
}

