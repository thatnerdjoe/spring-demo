package net.joemiller.spring.demo;

import net.joemiller.spring.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ComponentScanDemoApplication {

	//Use logger for debugging
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanDemoApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ComponentScanDemoApplication.class, args);

		PersComponentDAOonDAO personDao = applicationContext.getBean(ComponentDAO.class);

		ComponentDAO personDao2 = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}",ComponentDAO);
		LOGGER.info("{}",personDao.getJdbcConnection());


		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao.getJdbcConnection());

	}
}
