package kr.inhatc.spring;

import kr.inhatc.spring.engine.InfoCollector;
import kr.inhatc.spring.engine.PreConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevRgApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevRgApplication.class, args);
		InfoCollector infoCollector = new InfoCollector(System.getProperty("user.home"), "\\testCode.java");
		InfoCollector.classCollector(InfoCollector.preconvFileContents);
	}
}
