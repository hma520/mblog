package org.kingxkm.mblog.web;


import com.alibaba.fastjson.JSON;
import org.kingxkm.mblog.entity.User;
import org.kingxkm.mblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/listWithJson")
    @ResponseBody
    public String showWithJson() {
        System.out.println(userService.getAllUser());
        return JSON.toJSONString(userService.getAllUser());
    }

    @RequestMapping(method = RequestMethod.GET)
    public String show(Model m) {
        m.addAttribute("users", userService.getAllUser());
        return "user/list";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") Long id, Model m) {
        userService.deleteUser(id);
        m.addAttribute("users", userService.getAllUser());
        return "redirect:/user";
    }



}