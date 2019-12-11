package com.jivko.ls.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jivko.ls.models.Student;
import com.jivko.ls.models.Teacher;
import com.jivko.ls.models.User;

public interface UserRepository extends JpaRepository<Teacher, Student>{
	
	User findByUsernameAndSubject(final String username, final String subjectd);

}
