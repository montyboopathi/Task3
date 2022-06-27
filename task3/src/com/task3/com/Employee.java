package com.task3.com;

import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Employee {

	private static final Logger log = LogManager.getLogger(Employee.class);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		log.info("program is stated");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Employee type 1.permanentemployee 2.parttimeemployee 3.contractemployee");
		int empType = sc.nextInt();
		if (empType < 5 && empType > 0) {

			if (empType == 1) {
		CreateEmployee.Create();}
			if (empType == 2) {	
		UpdateEmployee.Update();}
			if (empType == 3) {		
		DeleteEmployee.Delete();}
			if (empType == 4) {	
		ListEmployee.List();}
	}

}}
