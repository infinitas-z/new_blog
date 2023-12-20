package com.jason.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jason.constants.SystemConstants;
import com.jason.domain.ResponseResult;
import com.jason.domain.entity.Article;
import com.jason.mapper.CategoryMapper;
import com.jason.domain.entity.Category;

import com.jason.service.ArticleService;
import com.jason.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 分类表(Category)表服务实现类
 *
 * @author makejava
 * @since 2023-12-04 16:47:08
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Resource
    private ArticleService articleService;

    @Override
    public ResponseResult getCategoryList() {
        // 查询文章表,状态已发布的文章
        LambdaQueryWrapper<Article> articleWrapper = new LambdaQueryWrapper<>();
        articleWrapper.eq(Article::getStatus, SystemConstants.ARTICLE_STATUS_DRAFT);
        List<Article> articleList = articleService.list(articleWrapper);
        //获取文章的分类id，并去重
        Set<Long> categoryIds = articleList.stream()
                .map(article -> article.getCategoryId())
                .collect(Collectors.toSet());
        //查询分类表
        List<Category> categories = listByIds(categoryIds);
        categories.stream().filter(category -> SystemConstants.STATUS_NOMAL.equals(category.))
        //分装VO
        return null;
    }
}

