package com.synap.converter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

	@RequestMapping(value="/json")
	@ResponseBody
	Map<String, String> testJson() {
		Map<String, String> maps = new HashMap<>();
		maps.put("1", "21");

		return maps;
	}
	@RequestMapping(value="/view")
	String test() {
		return "view";
	}
}