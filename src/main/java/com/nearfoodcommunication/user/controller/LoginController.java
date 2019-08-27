// register
package com.nearfoodcommunication.user.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@RequestMapping(method = RequestMethod.GET, value = "/login/{email}/{password}")
	public String redirect(@PathVariable String email, @PathVariable String password) {

		if ("a".equals(email) && "a".equals(password)) {
			return "redirect:/food-items";
		}
		return "-1";
	}
}