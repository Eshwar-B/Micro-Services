package in.ashokit.restControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		return "Welcome to Micro Services";
	}
	
}
