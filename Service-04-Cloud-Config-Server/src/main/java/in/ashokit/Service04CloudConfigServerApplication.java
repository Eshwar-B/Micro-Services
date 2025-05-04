package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Service04CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Service04CloudConfigServerApplication.class, args);
	}

}
