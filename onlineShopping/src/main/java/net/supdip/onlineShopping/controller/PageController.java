package net.supdip.onlineShopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.supdip.shoppingBackend.dao.CategoryDAO;

// we will be creating a controller class that will handle various url mapping like /, /index, /home all will be mapped to the same
// method handler. It will generate the data (greeting in our case) and along with it the logical view name.

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	
	@RequestMapping(value = {"/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickHome", true);
		return mv;
	}	
	
	@RequestMapping(value = "/about" )
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}	
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact", true);
		return mv;
	}	
	
	//Methods to load all the products and based on category
	@RequestMapping(value = {"/show/all/products"})
	public ModelAndView showAllProducts() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All Products");
		//passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllProducts", true);
		return mv;
	}	
	
	
	/*
	 * @RequestMapping(value="/test") public ModelAndView
	 * test(@RequestParam(value="greeting", required = false)String greeting) {
	 * if(greeting == null) { 
	 * greeting = "Hello there"; 
	 * } 
	 * ModelAndView mv = new ModelAndView("page"); 
	 * mv.addObject("greeting", greeting); 
	 * return mv; }
	 */
	
	/*
	 * @RequestMapping(value="/test/{greeting}") public ModelAndView
	 * test(@PathVariable("greeting")String greeting) { if(greeting == null) {
	 * greeting = "Hello there"; } ModelAndView mv = new ModelAndView("page");
	 * mv.addObject("greeting", greeting); return mv; }
	 */
}
