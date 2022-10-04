package net.joemiller.spring.spring_demo;

import net.joemiller.spring.spring_demo.scope.PersonDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class BeanScopeDemoApplication {

	//Use logger for debugging
	private static Logger LOGGER = LoggerFactory.getLogger(BeanScopeDemoApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(BeanScopeDemoApplication.class, args);

		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());


		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao.getJdbcConnection());

	}
}
