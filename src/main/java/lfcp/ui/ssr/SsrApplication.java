package lfcp.ui.ssr;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableAdminServer
//@EnableScheduling
public class SsrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsrApplication.class, args);
	}

}
