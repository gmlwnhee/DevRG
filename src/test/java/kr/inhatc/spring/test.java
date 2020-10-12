package kr.inhatc.spring;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class test {
	void test() throws IOException {
		Path path = new File("product.png").toPath();
	    String mimeType = Files.probeContentType(path);
	    System.out.println(mimeType);
	}
}
