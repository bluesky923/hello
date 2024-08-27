package com.bitc.orm.room.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("roomReg/")
public class roomController {
	
	@GetMapping("room")
	public String room() {
		return"/roomReg/room";
	}
	
	
	@PostMapping("reg")
	public String reg(Model model){
		
		model.addAttribute("msg","예약 성공");
		
		return"/roomReg/check";
	}
}
