package kr.inhatc.spring;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevRgApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void test() throws IOException {
		Path path = new File("product.java").toPath();
	    String mimeType = Files.probeContentType(path);
	    System.out.println(mimeType);
	}

}
