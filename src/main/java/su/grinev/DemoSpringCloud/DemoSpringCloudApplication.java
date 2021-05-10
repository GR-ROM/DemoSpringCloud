package su.grinev.DemoSpringCloud;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class DemoSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudApplication.class, args);
	}


}