package com.spmy.demo.ctrolller;

import com.spmy.demo.entity.Admin;
import com.spmy.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AdminCtronller {
    @Autowired
    private AdminService service;

    @ResponseBody
    @RequestMapping("/get")
    public List<Admin> getAll(){
        return service.findAll();
    }
}
