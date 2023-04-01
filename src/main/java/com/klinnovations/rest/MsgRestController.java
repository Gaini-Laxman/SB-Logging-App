package com.klinnovations.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	private Logger logger = LoggerFactory.getLogger(MsgRestController.class);

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		logger.debug(" this debug msg from welcome ");
		logger.info("WelcomeMsg() Started....");
		logger.warn("this is warning from WelcomeMsg()");

		try {
			int i = 10 / 0;
		} catch (Exception e) {
			logger.error("Exception occured...." + e.getMessage());
		}

		String msg = "Welcome To Laxman";
		logger.info("WelcomeMsg() Ended....");
		return msg;
	}
}
