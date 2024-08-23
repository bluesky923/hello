package com.bitc.orm;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class Controllerdd {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("direction")
	public String direction() {
		return"/comehere/direction";
	}
	
	@RequestMapping("inform")
	public String inform() {
		return"/information/inform";
	}
	
	@RequestMapping("lesson")
	public String lesson() {
		return"/lessonReg/lesson";
	}
	
	@RequestMapping("review_list")
	public String review() {
		return"/review/review_list";
	}
	
	@RequestMapping("room")
	public String room() {
		return"/roomReg/room";
	}
	
}
