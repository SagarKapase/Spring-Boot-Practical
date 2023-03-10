package com.jpaconcept;

import com.jpaconcept.dao.UserRepository;
import com.jpaconcept.entities.User;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class JpaConceptApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(JpaConceptApplication.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);

//		User user=new User();
//		user.setName("Sagar");
//		user.setCity("Jamkhed");
//		user.setStatus("Single");
//
//		User user1=userRepository.save(user);
//		System.out.println(user1);

//		User user1=new User();
//		user1.setName("Samarth");
//		user1.setCity("Mumbai");
//		user1.setStatus("Married");
//
//		User user2=new User();
//		user2.setName("vinayak");
//		user2.setCity("Bihar");
//		user2.setStatus("Single");
//
//		//save multiple objects
//		List<User> users=List.of(user1,user2);
//		Iterable<User> result=userRepository.saveAll(users);

//		result.forEach(user -> {
//			System.out.println(user);
//		});

//		System.out.println(result);

		// To get the user from database

		Optional<User> optional=userRepository.findById(1);
		User user=optional.get();
		user.setName("Vinayak Jalan");
		User result=userRepository.save(user);
		System.out.println(result);
	}

}
