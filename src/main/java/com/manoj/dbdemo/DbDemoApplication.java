package com.manoj.dbdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbDemoApplication implements CommandLineRunner
{
	
	@Autowired
	StoreInformationRepository storeInformationRepository;

	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}
	
	@Override
	public void run(String...  args) 
	{
		
		StoreInformation storeInformationOne = new StoreInformation("Amazon", "All types of bags are available", "XXXX");
		storeInformationRepository.save(storeInformationOne);
		
		storeInformationRepository.findByStoreName("Amazon").forEach(
				val -> System.out.println(val)
				);
		
	}
	
	

}
