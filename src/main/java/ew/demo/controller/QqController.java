package ew.demo.controller;


import ew.demo.model.Qq;
import ew.demo.service.Qqservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class QqController {
     @Autowired
    Qqservice qqservice ;
    @RequestMapping("/Qq")
    @ResponseBody
     public List<Qq> selByidandsex(){
        Qq qq = new Qq();
        qq.setId(2);
        qq.setSex("男");
        List<Qq> list = qqservice.selByidandsex(qq);
        System.out.println(list);
        return list;
    }
}
