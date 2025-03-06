package com.dm.datamanagement.dataManagement.controller;

import com.dm.datamanagement.dataManagement.Models.Member;
import com.dm.datamanagement.dataManagement.repository.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataManagementController {

    @Autowired
    MemberRepo repo;

    @GetMapping("/one")
    public String getOne() {
        return "Rest Controller";}

    @RequestMapping("/all")
    @ResponseBody
    public List<Member> showall(){
        return repo.getAll();
    }

}
