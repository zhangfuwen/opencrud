package com.zhangfuwen.opencrud.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dean on 2018/12/3.
 */
@RestController
@Api(value = "My Test2", description = "customized")
@RequestMapping("/my/test4")
public class Test4Controller
{

    @GetMapping("/testdata")
    @ApiOperation(value = "get test data", notes="haha")
    public String getTestData()
    {
        return "Test Data is empty";
    }
}