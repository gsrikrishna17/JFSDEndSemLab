package com.klef.jfsd.exam;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo 
{
	public static void main(String [] args)
	{
		 Scanner input=new Scanner(System.in);
		 Configuration cfg = new Configuration();
	  	  cfg.configure("hibernate.cfg.xml");
	  	
	  	  SessionFactory sf = cfg.buildSessionFactory();
	  	  Session session = sf.openSession();
	  	
	  	  Transaction t = session.beginTransaction();
	  	  Vehicle v=new Vehicle();
	  	  System.out.println("Enter Name:");
	  	  v.setName(input.next());
	  	  System.out.println("Enter Type:");
	  	  v.setType(input.next());
	  	  System.out.println("Enter Max Speed:");

	  	  v.setMaxspeed(input.nextDouble());
	  	  System.out.println("Enter Color:");

	  	  v.setColor(input.next());
	  	  
	  	  Car c=new Car();
	  	  System.out.println("Enter Number of doors:");

	  	  c.setNumberofdoors(input.nextInt());
	  	  Truck truck=new Truck();
	  	  System.out.println("Enter Load Capacity:");

	  	  truck.setLoadcapacity(input.next());	
	  	  session.persist(v);
	  	  session.persist(c);
	  	  session.persist(truck);
	  	 t.commit();
	  	 
	  	session.close();
	  	sf.close();
	  	  
	}
}
