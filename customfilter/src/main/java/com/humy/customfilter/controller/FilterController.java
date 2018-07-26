package com.humy.customfilter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FilterController {

    @RequestMapping("filter")
    @ResponseBody
    public String FilterTest(HttpServletRequest request) {
        String msg = (String) request.getAttribute("msg");
        return msg;
    }
}
