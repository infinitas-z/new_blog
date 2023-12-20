package com.jason.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jason.domain.ResponseResult;
import com.jason.domain.entity.Category;

public interface CategoryService extends IService<Category> {
    ResponseResult getCategoryList();
}
