package org.pet.clinic.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author perica
 *
 */
@Controller
public class IndexController {

	@RequestMapping({"","/","index","index.html"})
	public String index() {
		
		return "index";
	}
}
