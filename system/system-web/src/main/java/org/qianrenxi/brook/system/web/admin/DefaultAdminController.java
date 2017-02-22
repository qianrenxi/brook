package org.qianrenxi.brook.system.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class DefaultAdminController {
	
	@RequestMapping("")
	public String index(){
		return "admin/index";
	}
}
