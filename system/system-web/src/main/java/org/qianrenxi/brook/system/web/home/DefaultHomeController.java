package org.qianrenxi.brook.system.web.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DefaultHomeController {
	
	@RequestMapping("")
	public String index(){
		
		return "home/index";
	}
}
