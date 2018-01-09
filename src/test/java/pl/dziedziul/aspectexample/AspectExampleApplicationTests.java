package pl.dziedziul.aspectexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AspectExampleApplicationTests {

	@Autowired
	private SampleService sampleService;

	@Test
	public void contextLoads() {
		sampleService.sampleMethod();
	}

}
