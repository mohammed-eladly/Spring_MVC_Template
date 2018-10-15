package edu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.model.UserModel;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

	@GetMapping(value = "welcome")
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {

		UserModel userModel = new UserModel();
		userModel.setName("Mohammed ElAdly");

		return new ModelAndView("hello", "model", userModel);
	}
}
