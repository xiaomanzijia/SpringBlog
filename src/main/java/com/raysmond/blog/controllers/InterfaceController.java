package com.raysmond.blog.controllers;

import com.raysmond.blog.Constants;
import com.raysmond.blog.models.User;
import com.raysmond.blog.utils.JsonUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RequestMapping("/interface")
@RestController
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
}
