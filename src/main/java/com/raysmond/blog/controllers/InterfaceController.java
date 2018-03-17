package com.raysmond.blog.controllers;

import com.raysmond.blog.models.User;
import com.raysmond.blog.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/interface")
public class InterfaceController {

    @ResponseBody
    @RequestMapping(value = "v1.0/userinfo", method = RequestMethod.GET)
    public String getUserInfo() throws Exception {
//        List<User> users = new ArrayList<>();
//        users.set(0, new User("823354103@qq.com", "licheng", "admin"));
//        return JsonUtils.obj2json(users);
        User user = new User();
        user.setPassword("fdsf332");
        return JsonUtils.obj2json(user);
    }

    @PostMapping(value = "/post/test")
    public void doPost() {
        System.out.println("POST请求测试");
    }

    @RequestMapping(value = "/post/testother", method = {RequestMethod.POST})
    public void doPostOther() {
        System.out.println("POST请求测试Other");
    }
}
