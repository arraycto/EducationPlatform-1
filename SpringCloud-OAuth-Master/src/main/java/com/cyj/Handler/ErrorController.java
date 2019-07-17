package com.cyj.Handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 
 * @Description: 403控制器
 * @ClassName: ErrorController.java
 * @author ChenYongJia
 * @Date 2018年12月04日 下午20:40:56
 * @Email 867647213@qq.com
 */
@Controller
public class ErrorController {
	
	@GetMapping("/403")
	public String error() {
		return "403";
	}
	
}
