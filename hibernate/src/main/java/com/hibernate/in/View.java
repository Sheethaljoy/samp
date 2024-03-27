package com.hibernate.in;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class View {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session sess = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of student to see details - ");
		int id = sc.nextInt();
		Student stud = sess.get(Student.class, id);
		System.out.println("Details of student " + stud.getId());
		System.out.println("Name - " + stud.getName());
		System.out.println("Age - " + stud.getAge());
		sc.close();
	}
}

