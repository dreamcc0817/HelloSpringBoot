package com.dreamcc.springboot.controller;

import com.dreamcc.springboot.entity.Spittle;
import com.dreamcc.springboot.exception.MyException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: Demo
 * @Package: com.dreamcc.springboot.controller
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/8/1 8:28
 * @Version: V1.0
 */
@RestController("/myController")
public class MyController {

	@GetMapping("/{spittleId}")
	public String spittle(@PathVariable long spittleId, Model model){
		Spittle spittle ;
		return null;
	}

	@ExceptionHandler(MyException.class)
	public String handleDulicateSpittle(){
		return "";
	}
}
