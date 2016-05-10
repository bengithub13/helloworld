package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = HelloworldApplication.class)
@ActiveProfiles("junit")
public class HelloworldApplicationTests {
	@Value("${testing.test}")
	private String testing;
	@Test
	public void contextLoads() {
		System.out.println("TESTING CONFIGSERVER PROPERTY VALUE INJECTED := " +testing);
	}

}
