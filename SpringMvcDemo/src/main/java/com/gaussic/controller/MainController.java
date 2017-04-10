package com.gaussic.controller;

import aspct.PointCut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wjll9 on 2017/3/24.
 */
@Controller
public class MainController {
    //@Autowired
    PointCut pointCut=new PointCut();

    @RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @RequestMapping(method=RequestMethod.GET,value="/login")
    public String login(){return "login";}

    @RequestMapping(value="/test",method=RequestMethod.GET)
    public void test(){
        pointCut.play();
    }
}