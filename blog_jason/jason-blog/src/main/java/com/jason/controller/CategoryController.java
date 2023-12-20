package com.jason.controller;

import com.jason.domain.ResponseResult;
import com.jason.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;


    @GetMapping("/getCategoryList")
    public ResponseResult getCategoryList(){
        return  categoryService.getCategoryList();
    }
}
