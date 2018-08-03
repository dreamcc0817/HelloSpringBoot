package com.dreamcc.pizza.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @Title: Demo
 * @Package: com.dreamcc.pizza.config
 * @Description:
 * @Author: dreamcc
 * @Date: 2018/8/2 9:25
 * @Version: V1.0
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		super.configure(auth);
		auth.inMemoryAuthentication().withUser("user").password("password").and().withUser("");
	}

}
