package org.toannguyen.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "newControllerOfAdmin")
public class NewController {
	@RequestMapping(value = "/new/list", method = RequestMethod.GET)
	public ModelAndView showListNew() {
		ModelAndView mav = new ModelAndView("admin/new/list");
		return mav;
	}
	
	@RequestMapping(value = "/new/edit", method = RequestMethod.POST)
	public ModelAndView editNew() {
		ModelAndView mav = new ModelAndView("admin/new/list");
		return mav;
	}
}