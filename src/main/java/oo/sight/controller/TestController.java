package oo.sight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sight/test")
public class TestController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		System.out.println("hello....");
		return "hello";
	}
}
