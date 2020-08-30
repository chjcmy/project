package com.sung.springboot.cruddemo.dao;

import java.util.List;

import com.sung.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {


	public List<Employee> findAll();

}
