package net.joemiller.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
		// no longer needed, managed by Spring

		//setup application context
		// Will not start without Beans of type SortAlgorithm
		// Will not start with >1 Beans of type SortAlgorithm, unless @Primary is used
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

		System.out.println(result);
	}



}
