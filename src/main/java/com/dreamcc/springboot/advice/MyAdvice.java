package com.dreamcc.springboot.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Title: Demo
 * @Package: com.dreamcc.springboot.advice
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/8/1 9:24
 * @Version: V1.0
 */
@ControllerAdvice
public class MyAdvice {

	@ExceptionHandler
	public String duplicateSpittleHandle(){
		return "/";
	}

}
