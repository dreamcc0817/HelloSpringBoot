package com.dreamcc.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @Title: Demo
 * @Package: com.dreamcc.springboot.exception
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/8/1 8:42
 * @Version: V1.0
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "File Not Found")
public class MyException extends RuntimeException{
}
