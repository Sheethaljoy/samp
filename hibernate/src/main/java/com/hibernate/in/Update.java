package com.hibernate.in;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Update {

	public static void main(String[] args) {
		Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session sess = sf.openSession();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of student to update - ");
		int id = sc.nextInt();
		Student stud = sess.get(Student.class, id);
		Transaction transaction = sess.beginTransaction();
		System.out.println("Details of student " + stud.getId());
		System.out.println("Name - " + stud.getName());
		System.out.println("Age - " + stud.getAge());
		System.out.println("Update Details of " + stud.getId() + " to - ");
		System.out.println("Enter name - ");
		String name = sc.next();
		System.out.println("Enter age - ");
		int age = sc.nextInt();
		stud.setName(name);
		stud.setAge(age);
		sess.update(stud);
		transaction.commit();
		sc.close();
	}
}

