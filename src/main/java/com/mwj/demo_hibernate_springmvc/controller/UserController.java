package com.mwj.demo_hibernate_springmvc.controller;

import com.mwj.demo_hibernate_springmvc.entry.User;
import com.mwj.demo_hibernate_springmvc.service.IUserService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by MWJ on 2017/12/25.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping(value = "userLogin", method = RequestMethod.GET)
    public String addUser(@ModelAttribute("user") User user, ModelMap modelMap) {
        return "success";
    }
}
