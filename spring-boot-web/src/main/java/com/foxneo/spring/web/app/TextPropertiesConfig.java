package com.foxneo.spring.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
	@PropertySource("classpath:mensajes_es.properties")
})
public class TextPropertiesConfig {

}
