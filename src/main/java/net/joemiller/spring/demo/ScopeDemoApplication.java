package net.joemiller.spring.demo;

import net.joemiller.spring.demo.basic.BinarySearchImpl;
import net.joemiller.spring.demo.scope.PersonDAO;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class ScopeDemoApplication {

	//Use logger for debugging
	private static Logger LOGGER = LoggerFactory.getLogger(ScopeDemoApplication.class);

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ScopeDemoApplication.class, args);

		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());


		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao.getJdbcConnection());

	}
}
