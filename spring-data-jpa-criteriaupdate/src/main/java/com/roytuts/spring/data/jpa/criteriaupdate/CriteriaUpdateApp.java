package com.roytuts.spring.data.jpa.criteriaupdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.roytuts.spring.data.jpa.criteriaupdate.service.UpdateService;

@SpringBootApplication
@EntityScan(basePackages = "com.roytuts.spring.data.jpa.criteriaupdate.entity")
public class CriteriaUpdateApp implements CommandLineRunner {

	@Autowired
	private UpdateService updateService;

	public static void main(String[] args) {
		SpringApplication.run(CriteriaUpdateApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CriteriaUpdate::Bulk Update Started...");
		updateService.updateBulkProducts("Desktop", 31000.50);
		System.out.println("CriteriaUpdate::Bulk Update Done.");
	}

}
