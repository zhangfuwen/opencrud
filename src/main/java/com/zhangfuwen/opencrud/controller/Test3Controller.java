/*
 * Copyright (C) 2017 Zhejiang BYCDAO Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.BYCDAO.com.
 * Developer Web Site: http://open.BYCDAO.com.
 */

package com.zhangfuwen.opencrud.controller;

import com.swagger.bootstrap.ui.demo.common.Rest;
import com.swagger.bootstrap.ui.demo.domain.old.Menu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhangfuwen.opencrud.model.TestData;

/***
 *
 * @since:swagger-bootstrap-ui-demo 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a> 
 * 2017/08/10 14:14
 */
@Api(value = "测试API",description = "仅用于测试")
@RestController
@RequestMapping("/my/test3")
public class Test3Controller {

    @PostMapping("/postTest")
    @ApiOperation(value = "发送Post请求",notes = "不考虑递归的情况")
    public TestData getMenu(){
        return new TestData(5,"test1", "Fail");
    }

    @PostMapping("/getRestMenu")
    @ApiOperation(value = "响应泛型为菜单Menu对象",notes = "获取菜单,考虑递归的情况")
    public Rest<Menu> getRestMenu(){
        Menu menu=new Menu("caidan_system","菜单系统");

        menu.addChildren(new Menu("label1","菜单1"));
        menu.addChildren(new Menu("label2","菜单2"));
        menu.addChildren(new Menu("label3","菜单3"));
        menu.addChildren(new Menu("label4","菜单4"));

        Rest<Menu> rest=new Rest<>();
        rest.setData(menu);
        return rest;
    }
}
