package cn.cathetine.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:xjk 2019/8/5 13:18
 * cn.cathetine.admin.controller
 */
@RestController
public class AdminController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "hello " + name + ", this is template-admin";
    }
}
