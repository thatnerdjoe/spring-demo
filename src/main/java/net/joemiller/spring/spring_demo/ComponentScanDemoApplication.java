package net.joemiller.spring.spring_demo;

import net.joemiller.spring.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("net.joemiller.spring.componentscan")
public class ComponentScanDemoApplication {

	//Use logger for debugging
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanDemoApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ComponentScanDemoApplication.class, args);

		//
		ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}",componentDao);

	}
}
