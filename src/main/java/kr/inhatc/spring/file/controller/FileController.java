package kr.inhatc.spring.file.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.inhatc.spring.file.service.FileService;

@Controller
public class FileController {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FileService fileService;
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("sender","안녕하세요");
		return "file/main";
	}
	
	@GetMapping("/index")
	public String test() {
		return "index";
	}
	
} 
  