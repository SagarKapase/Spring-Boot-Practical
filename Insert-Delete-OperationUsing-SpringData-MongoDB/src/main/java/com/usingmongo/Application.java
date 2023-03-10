package com.usingmongo;

import com.usingmongo.dto.CustomerDTO;
import com.usingmongo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
import java.util.logging.Logger;

@SpringBootApplication
public class Application implements CommandLineRunner {

	static Logger logger=Logger.getLogger(String.valueOf(Application.class));
	@Autowired
	CustomerService customerService;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CustomerDTO customer1=new CustomerDTO(9665441125L,"Sagar",21,'M',"Ahmednagar");
		CustomerDTO customer2=new CustomerDTO(7219667633L,"Samarth",21,'M',"Thane");

		//Invoking service layer method to insert customer details into the customer table
		customerService.insertCustomer(customer1);
		customerService.insertCustomer(customer2);

		logger.info("Added Customer Successfully...");

		System.out.println("Enter the customer phone number to be deleted : ");
		Scanner scan=new Scanner(System.in);
		Long phoneNumber=scan.nextLong();

		//Invoking service layer method to remove customer details from customer table
		customerService.removeCustomer(phoneNumber);
		logger.info("Customer removed successfully...");
		scan.close();

	}
}
