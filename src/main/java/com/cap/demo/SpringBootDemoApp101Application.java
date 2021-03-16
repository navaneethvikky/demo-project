package com.cap.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cap.demo.entity.Trainee;
import com.cap.demo.service.TraineeService;

@SpringBootApplication
public class SpringBootDemoApp101Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApp101Application.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBootDemoApp101Application.class);

		TraineeService traineeService = context.getBean("service",TraineeService.class);

		// Add trainees
		traineeService.addTrainee(new Trainee("Sunil", "JEEReact"));
		traineeService.addTrainee(new Trainee("David", "JEEAngular"));
		traineeService.addTrainee(new Trainee("Sameer", "JEEReact"));
		traineeService.addTrainee(new Trainee("Paul", "JEEAngular"));

			//printing 1st trainee info 
			System.out.println(traineeService.getTraineeById(1));
			
			//removing trainee by id
			traineeService.removeTrainee(1);
			
			traineeService.updateTrainee(new Trainee(2,"akash", "JEE"));
		// Get trainees
		List<Trainee> trainees = traineeService.getAllTrainees();
		for (Trainee trainee : trainees) {
			System.out.println("Id = " + trainee.getTraineeId());
			System.out.println("Name = " + trainee.getTraineeName());
			System.out.println("Batch Name = " + trainee.getBatchName());
			System.out.println();
			}
	}

}
