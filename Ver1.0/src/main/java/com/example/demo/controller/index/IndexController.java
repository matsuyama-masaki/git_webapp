package com.example.demo.controller.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *Welcome画面のコントローラクラス 
 */
@Controller
public class IndexController {

	/***************************************************************************
	/**
	 *         ★TOP画面表示★
	 *         /のURLが送られてきた場合、
	 * @return top画面を表示する
	 */

	@GetMapping("/index")
	public String indexView() {

		return "index";
	}
}