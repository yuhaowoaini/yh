package ew.demo.service;

import ew.demo.dao.QqMapper;

import ew.demo.model.Qq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Qqservice {
@Autowired
    private QqMapper qqMapper;
public List<Qq> selByidandsex(Qq qq){
     return qqMapper.selByidandsex(qq);
}
}
