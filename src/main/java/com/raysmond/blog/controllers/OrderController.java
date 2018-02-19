package com.raysmond.blog.controllers;

import com.raysmond.blog.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    @Autowired
    OrderRepository orderRepository;


}
