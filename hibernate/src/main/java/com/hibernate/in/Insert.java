package com.hibernate.in;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
	public static void main(String[] args) {
		Configuration conf = new Configuration().configure(); 
		SessionFactory sf = conf.buildSessionFactory();
		Session ses = sf.openSession();
		//to begin a transaction
		Transaction ts = ses.beginTransaction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name - ");
		String name = sc.next();
		System.out.println("Enter age - ");
		int age = sc.nextInt();
		Student std = new Student(name, age);
		ses.save(std);
		ts.commit();
		sc.close();
	}
}