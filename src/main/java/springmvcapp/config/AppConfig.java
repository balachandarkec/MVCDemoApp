package springmvcapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"springmvcapp"})
public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver resolver() {
		
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/"); // --/WEB-INF/views/index.jsp
		resolver.setSuffix(".jsp");
		return resolver;
		
	}
	

}
