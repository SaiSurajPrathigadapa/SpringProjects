package com.employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.employee.Model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>
{
	
}
