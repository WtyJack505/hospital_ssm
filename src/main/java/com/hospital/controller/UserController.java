package com.hospital.controller;

import com.hospital.entity.User;
import com.hospital.service.UserService;
import com.hospital.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wty
 * on 2021/7/11
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value="/list",method = RequestMethod.GET,produces="application/json;charset=UTF-8")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }
}
