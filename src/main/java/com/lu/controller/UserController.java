package com.lu.controller;

import com.lu.dao.UserDao;
import com.lu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author GAN
 */
@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("getUser")
    @ResponseBody
    public List<User> getUser () {
        return userDao.findAll();
    }






















}
