package com.StudentManagmentSystem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentManagmentSystem.entity.Student;
import com.StudentManagmentSystem.service.StudentService;
@Service
public class ServiceImpl implements StudentService{
    @Autowired
	com.StudentManagmentSystem.repository.Studentrepository Studentrepository;
	
	@Override
	public List<Student> getAllStudent() {
		List<Student> list=Studentrepository.findAll();
		return list;
	}

	@Override
	public Student saveStudent(Student student) {

		return Studentrepository.save(student);
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return Studentrepository.findById(id).get();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Studentrepository.deleteById(id);
		
	}
	

}
