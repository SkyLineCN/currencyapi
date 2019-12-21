package com.skyline.currencyapi.controller;

import com.skyline.currencyapi.entity.apidata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 李星燃
 * @date 20191221 2007
 */
@RestController
public class CurrentApiController {


    @Autowired
    private com.skyline.currencyapi.entity.apidata apidata;

    @Autowired
    private apidatamapper   mapper;


    //@RequestMapping(value="/get",method=RequestMethod.GET)
    @GetMapping("/getapidata")
    private  apidata  getapidata(){
        return    mapper.findData();
    }

}
