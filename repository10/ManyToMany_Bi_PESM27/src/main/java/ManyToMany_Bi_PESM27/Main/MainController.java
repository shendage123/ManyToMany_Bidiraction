package ManyToMany_Bi_PESM27.Main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ManyToMany_Bi_PESM27.Dto.Course;
import ManyToMany_Bi_PESM27.Dto.Student;

public class MainController {

	public static void main(String[] args) {
		  
		
		
		
		Student s1=new Student();
		s1.setName("jonh");
		s1.setAddress("nashik");
		s1.setPhone(782867);
		
		
		Student s2=new Student();
		s2.setName("james");
		s2.setAddress("USA");
		s2.setPhone(828267);
		
		
		
		
		Student s3=new Student();
		s3.setName("Varun");
		s3.setAddress("Up");
		s3.setPhone(782827);
		
		
		Course c1=new Course();
		c1.setName("C");
		c1.setFees(2232);
		c1.setDuration(1);
		
		Course c2=new Course();
		c2.setName("C++");
		c2.setFees(2232);
		c2.setDuration(1);
		
		
		Course c3=new Course();
		c3.setName("C#");
		c3.setFees(2232);
		c3.setDuration(1);
		
		List<Course>courses1=new ArrayList<Course>();
		courses1.add(c1);
		courses1.add(c2);
		courses1.add(c3);
		
		
		List<Course>courses2=new ArrayList<Course>();
		courses2.add(c1);
		courses2.add(c2);
		
		List<Course>courses3=new ArrayList<Course>();
		courses3.add(c2);
		courses3.add(c3);
		
		s1.setCourses(courses1);
		s2.setCourses(courses2);
		s2.setCourses(courses2);
		
		List<Student>l1=new ArrayList<Student>();
		l1.add(s1);
		l1.add(s2);
		

		List<Student>l2=new ArrayList<Student>();
		l2.add(s1);
		l2.add(s2);
		l2.add(s3);
		

		List<Student>l3=new ArrayList<Student>();
		l3.add(s1);
		l3.add(s3);
		
		c1.setStudents(l1);
		c2.setStudents(l2);
		c3.setStudents(l3);
	
		
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rajath");
		  EntityManager entityManager= entityManagerFactory.createEntityManager();
		  EntityTransaction entityTransaction= entityManager.getTransaction();
		  
		  entityTransaction.begin();
		  entityManager.persist(s1);
		  entityManager.persist(s2);
		  entityManager.persist(s3);
		  entityManager.persist(c1);
		  entityManager.persist(s2);
		  entityManager.persist(s3);
		  entityTransaction.commit();
		  
		  

		   
		
		
		
		
		

	}

}
