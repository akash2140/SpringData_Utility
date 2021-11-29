package com.akash;

import java.time.LocalDate;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akash.entity.Customer;
import com.akash.repository.CustomerRepository;
import com.akash.utility.CustomerType;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner{
	
	@Autowired
	CustomerRepository repo;
	
	private static final Log logger=LogFactory.getLog(SpringDataDemoApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		// TODO Auto-generated method stub
		Customer customer1=new Customer(2, "akash@domain.com", "Aakash", LocalDate.of(1997, 03, 04), CustomerType.PLATINUM);
		Customer customer2=new Customer(3, "ayush@domain.com", "Ayush", LocalDate.of(1997, 05, 07), CustomerType.GOLD);
		
		repo.save(customer1);
		repo.save(customer2);
		
		Customer customer=repo.findById(2).get();
		logger.info(customer);
		
		Customer cust=repo.findById(3).get();
		logger.info(cust);
	}

	
}
