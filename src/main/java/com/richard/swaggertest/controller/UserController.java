package com.richard.swaggertest.controller;

import com.richard.swaggertest.model.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/user")
public class UserController {
    @ApiOperation("新增用戶介面")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }
    @ApiOperation("查詢用戶介面")
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }
    @ApiOperation("更新用戶介面")
    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }
    @ApiIgnore
    @ApiOperation("刪除用戶介面")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}
