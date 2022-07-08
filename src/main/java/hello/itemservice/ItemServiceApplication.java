package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);

		TestDto testDto = new TestDto();

		testDto.setTest("test");
		System.out.println(testDto.getTest());
	}

}
