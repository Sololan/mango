package com.sololan.mango.controller;

import com.sololan.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private SysUserService sysUserService;

    @GetMapping(value = "/hello")
    public Object hello(){
        return "Hello Mango";
    }

    @GetMapping(value = "/findAll")
    public Object findAll(){
        return sysUserService.findAll();
    }
}
