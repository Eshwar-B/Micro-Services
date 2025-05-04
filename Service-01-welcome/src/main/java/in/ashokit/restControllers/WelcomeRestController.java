package in.ashokit.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		String msg = "Welcome to Micro Services ! , Port number : " + env.getProperty("server.port"); 
		return msg;
	}
	
}
