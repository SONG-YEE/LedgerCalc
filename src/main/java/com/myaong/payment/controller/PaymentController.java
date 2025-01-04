package com.myaong.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaymentController {
	
	@GetMapping("/")
	public String payInfo() {
		return "sampleIndex";
	}
}
