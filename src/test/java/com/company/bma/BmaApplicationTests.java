package com.company.bma;

import org.junit.jupiter.api.Test;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class,ManagementWebSecurityAutoConfiguration.class})
class BmaApplicationTests {

	@Test
	void contextLoads() {
	}

}
