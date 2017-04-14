package com.turtle;

import com.turtle.model.AuthenticationResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = BackendApplication.class)
@Configuration
public class BackendApplicationTests {

    private static final Logger LOG = LoggerFactory.getLogger(BackendApplicationTests.class);

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void contextLoads() {

		String username = "turtle";
		LOG.info("Starting test");
		for (int i = 0; i < 100; i++) {
            ResponseEntity<AuthenticationResponse> response = testRestTemplate.postForEntity("/account/authenticate/{username}", null, AuthenticationResponse.class, username);
        }
        LOG.info("Ending test");

	}

}
