package com.ppublica.shopify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class InfoController {
	
	@RequestMapping(path = "/info", method = RequestMethod.GET)
	public String info() {
		
				
		return "info";
	}

	@RequestMapping(path = "", method = RequestMethod.GET)
	@ResponseBody
	public String home() {


		return "hi";
	}

}
