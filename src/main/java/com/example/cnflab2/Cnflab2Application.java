package com.example.cnflab2;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Cnflab2Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SpringApplication.run(Cnflab2Application.class, args);
		ApplicationContext ac = new ClassPathXmlApplicationContext("lab2.xml");
		Department dt = (Department) ac.getBean("department");

		
		while(true) {
			System.out.println("1.Insert \n 2. Display \n 3.Exit");
			System.out.println("Enter the choice:- ");
			int a = sc.nextInt();
			switch(a) {
			case 1:
				System.out.println("Enter the department name:- ");
				dt.setName(sc.next());
				System.out.println("Enter the dept number:- ");
				dt.setId(sc.nextInt());
				System.out.println("Enter the department description:- ");
				dt.setDescription(sc.next());
				break;
			case 2:
				System.out.println("Department Details");
				System.out.println("Name:- "+ dt.getName()+ " "+ "ID:- "+ dt.getId()+ " " + "Department Decription:- "+ dt.getDescription());
				System.out.println("College Details");
				College c = dt.getCollege();
				System.out.println("College Name :- " + c.getName());
				System.out.println("College Address:- "+ c.getAddress());
				break;
				
			}
		}
	}

}
