package com.harshakj.cognitoDemo;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class CognitoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CognitoDemoApplication.class, args);
	}
	
	@RequestMapping(value = "/name", method = RequestMethod.GET)
	@ResponseBody
    public String getName(Authentication authentication, Principal principal) {
        System.out.println(authentication.getName());
        System.out.println(principal.getName());
        return authentication.getName();
    }
}
