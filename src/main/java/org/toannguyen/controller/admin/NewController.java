package org.toannguyen.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import org.toannguyen.model.NewModel;
import org.toannguyen.service.INewService;

@Controller(value = "newControllerOfAdmin")
public class NewController {

	@Autowired//thay the inject
	private INewService newService;

	@RequestMapping(value = "/quan-tri/bai-viet/danh-sach", method = RequestMethod.GET)
	public ModelAndView showListNew(@ModelAttribute("model") NewModel model) {

		ModelAndView mav = new ModelAndView("admin/new/list");
		model.setListResult(newService.findAll());
		
		mav.addObject("model", model);

		return mav;
	}

	@RequestMapping(value = "/quan-tri/bai-viet/chinh-sua", method = RequestMethod.POST)
	public ModelAndView editNew() {
		ModelAndView mav = new ModelAndView("admin/new/list");
		return mav;
	}
}