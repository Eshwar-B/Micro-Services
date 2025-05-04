package in.ashokit.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.WelcomeFeignClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeFeignClient welcomeClient;
	
    @GetMapping("/greet")
    public String getGreetMsg() {
        String greetMsg = " Good Morning !!  ";
        String welcomeMsg = welcomeClient.getWelcomeMsg();
        return greetMsg +  welcomeMsg; 
    }
}