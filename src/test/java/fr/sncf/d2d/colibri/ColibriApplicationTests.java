package fr.sncf.d2d.colibri;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.hamcrest.Matchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class ColibriApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void sayHello() throws Exception {
		this.mockMvc.perform(
			get("/")
				.queryParam("name", "Jimmy")
		).andExpectAll(
			content().string(is("Bonjour, Jimmy")),
			content().contentTypeCompatibleWith(MediaType.TEXT_PLAIN_VALUE),
			status().is(HttpStatus.OK.value())
		);
	}

}
