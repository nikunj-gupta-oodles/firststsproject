package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller

public class TestController {
 
	@RequestMapping() 
	@ResponseBody
	
	public String handleTest() 
	{
		
		return "this is project using sts" ;
	}


}
