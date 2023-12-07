package fr.sncf.d2d.colibri;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
class ColibriApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void sayHello() throws Exception {
		this.mockMvc.perform(
				MockMvcRequestBuilders.get("/").queryParam("name", "Jimmy")
		).andExpectAll(
				MockMvcResultMatchers.content().string(Matchers.is("Bonjour Jimmy")),
				MockMvcResultMatchers.status().is(HttpStatus.OK.value()),
				MockMvcResultMatchers.content().contentType("text/plain;charset=UTF-8")
		);
	}

}
