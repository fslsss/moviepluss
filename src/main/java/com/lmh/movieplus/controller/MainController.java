package com.lmh.movieplus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    /**
     * 加载主页
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/")
    public ModelAndView movieMain(){

        ModelAndView modelAndView= new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
