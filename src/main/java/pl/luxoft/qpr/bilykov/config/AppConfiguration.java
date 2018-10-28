package pl.luxoft.qpr.bilykov.config;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.BeanNameViewResolver;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableJpaRepositories(basePackages = {"pl.luxoft.qpr.bilykov.repository"})
@EnableTransactionManagement
@ComponentScan("pl.luxoft.qpr.bilykov")
public class AppConfiguration extends WebMvcAutoConfigurationAdapter  {

}
