package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2.code.hibernate.demo.entity.Course;
import com.luv2.code.hibernate.demo.entity.Instructor;
import com.luv2.code.hibernate.demo.entity.InstructorDetail;
import com.luv2.code.hibernate.demo.entity.Student;

public class CreateInstructorDemo {

	public static void main(String[] args) {
			
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			//create the objects
			Instructor tempInstructor =
					new Instructor("��","����", "darby@naver.com");
			InstructorDetail tempInstructorDetail =
					new InstructorDetail(
							"http://ww.luv2code.com/youtube",
							"Video Games!!!");
			// associate the objects
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			
			
			// start a transaction
			session.beginTransaction();
			
			// save the instructor
			System.out.println("Saving instructor:" + tempInstructor);
			session.save(tempInstructor);
			// commit transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			
			
		} 
		finally {
			
			// add clean up code
			session.close();
			factory.close();
		}
		
	}

}
