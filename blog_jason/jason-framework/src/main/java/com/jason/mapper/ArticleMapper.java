package com.jason.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jason.domain.entity.Article;
import org.mapstruct.Mapper;

/**
 * 文章表(Article)表数据库访问层
 *
 * @author makejava
 * @since 2023-11-17 14:57:49
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}

