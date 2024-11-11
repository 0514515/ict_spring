package com.javaclass.basic;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		model.addAttribute("serverTime", "이번 고된주였습니다. 희망찬 내년으,ㄹ 위해" );
		
		return "fighting";
	}
	
}
