package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan //서블릿 자동 등록
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}
	
	//p.180 뷰 리졸버 관련 설명 -> 스프링이 아래 코드에서 할 일을 대신 해서 빈으로 자동 등록한 것
//	@Bean
//	ViewResolver internalResourceViewResolver() {
//		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
//	}
}
