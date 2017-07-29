package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.json.JSONDemo;

@RestController
public class MainController {

	 @RequestMapping(value = "/index", method = RequestMethod.GET)
	 @ResponseBody
	 public String index(){
		 JSONDemo index = new JSONDemo();
		 return index.getJSON();
	 }
}
