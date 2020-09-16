package fr.moneycore.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHome {
	
	@RequestMapping("/")
	public String helloWorld() {
		return "Hello World !!!!";
	}

}
