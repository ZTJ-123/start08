package com.spmy.demo.service;

import com.spmy.demo.entity.Admin;
import com.spmy.demo.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminService {
    @Autowired
    private AdminMapper mp;

    public List<Admin> findAll(){
       return mp.findAll();
    }
}
