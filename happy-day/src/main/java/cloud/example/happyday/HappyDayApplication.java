package cloud.example.happyday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class HappyDayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappyDayApplication.class, args);
    }

}
