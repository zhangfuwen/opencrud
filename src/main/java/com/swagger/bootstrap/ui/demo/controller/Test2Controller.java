package com.swagger.bootstrap.ui.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dean on 2018/12/3.
 */
@RestController
@Api(value = "My Test2", description = "customized")
@RequestMapping("/api/test2")
public class Test2Controller
{

    @GetMapping("/testdata")
    @ApiOperation(value = "get test data", notes="haha")
    public String getTestData()
    {
        return "Test Data is empty";
    }
}
