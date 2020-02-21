package com.richard.swaggertest.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用戶實體")
public class User {
    @ApiModelProperty("用戶id")
    private int id;

    @ApiModelProperty("用戶姓名")
    private String name;

    @ApiModelProperty("用戶地址")
    private String address;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public User setAddress(String address) {
        this.address = address;
        return this;
    }
}
