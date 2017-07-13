package webproject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.PostConstruct;

@EnableWebMvc
@Configuration
@ComponentScan("webproject.app")
public class Config extends WebMvcConfigurerAdapter {

    @PostConstruct
    public void init() {
        System.out.println("Done.");
    }


}
