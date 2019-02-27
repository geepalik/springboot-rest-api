package com.gil.springcrudrestapi.springrestcrud.Employee.repository;

import com.gil.springcrudrestapi.springrestcrud.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
