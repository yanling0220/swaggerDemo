package com.yanling.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;

/**
 * 测试swagger , controller
 *
 * @author yanling
 * @time 2018-03-21-13:43
 */
@Api(tags = "SwaggerTestController",description = "测试swagger")
@Controller
public class SwaggerTestController {

    @ApiOperation(value = "swagger 测试方法")
    public String demoSwaggerMethod(String param){
        return "swagger 测试方法";
    }
}
