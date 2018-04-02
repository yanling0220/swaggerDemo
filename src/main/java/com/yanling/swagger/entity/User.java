package com.yanling.swagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * swagger 测试entity
 *
 * @author yanling
 * @time 2018-03-23-15:30
 */
@ApiModel(value = "User 对象",description = "swagger 测试实体")
public class User {
    @ApiModelProperty(value ="用户Id",name = "id")
    private Long id;
    @ApiModelProperty(value ="用户年龄" ,name = "age")
    private Long age;
    @ApiModelProperty(value ="用户名称" ,name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
