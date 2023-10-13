package com.example.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping(value="/dev")
public String getmsg() {
	return " Sucessfully ";
}
}
