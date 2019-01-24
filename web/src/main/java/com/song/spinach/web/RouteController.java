package com.song.spinach.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class RouteController {

    @RequestMapping(value = "/status",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public ModelAndView status(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        return new ModelAndView("status",modelMap);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        return "spinach home here.";
    }
}
