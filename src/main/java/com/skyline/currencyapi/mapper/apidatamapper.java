package com.skyline.currencyapi.mapper;

import org.apache.ibatis.annotations.Select;

import com.skyline.currencyapi.entity.apidata;

public abstract class apidatamapper {

    @Select("select  *  from apidata")
    public abstract  com.example.demo.controller.apidata findData();
}
