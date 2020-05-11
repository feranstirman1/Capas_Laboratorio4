package com.uca.Laboratorio4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.Laboratorio4.domain.Producto;
import com.uca.Laboratorio4.domain.Robot;

@Controller
public class MainController {

	@RequestMapping("/producto")
	public ModelAndView producto() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("producto");
		mav.addObject("producto", new Producto());
		return mav;
	}
	
	@RequestMapping("/validar")
	public ModelAndView validar(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("producto");
		}else {
			mav.addObject("robot", new Robot());
			mav.setViewName("robot");
		}
		return mav;
		
	}
	
	@RequestMapping("/seguridad")
	public ModelAndView seguridad(@Valid @ModelAttribute Robot robot,BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			mav.setViewName("robot");
		}else {
			mav.setViewName("exito");
		}
		return mav;
	}
	
}
