package com.example.jql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jql.Entity.Employees;
import com.example.jql.Entity.Employees2;
import com.example.jql.Repository.Employee2Repository;
import com.example.jql.Repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository emprepository;
	@Autowired
	private Employee2Repository emp2repository;
	
	public Employees2 addemp2(Employees employee) {
		Employees2 emp2 = new Employees2();
		emp2.setEmpId(employee.getEmpId());
		emp2.setEmpName(employee.getEmpName());
		emp2.setLocation(employee.getLocation());
		emprepository.save(employee);
		return emp2repository.save(emp2);
	}
	
	public List<Employees> namelike(String name){
	return	emprepository.findByEmpNameContaining(name);
	}
	

	public Employees addEmployee(Employees employee) {
	
		return emprepository.save(employee);
		
	}
	
	
	
	
	
	public Employees updateEmployee(int id,Employees employee) {
		Employees emp = emprepository.findById( id).get();
		emp.setEmpId(employee.getEmpId());
		emp.setEmpName(employee.getEmpName());
		emp.setLocation(employee.getLocation());
		return emprepository.save(emp);
	}
	
	public String deletebyid(int id) {
		emprepository.deleteById(id);
		return "deleted successfully";
	}
	public List<Employees> saveall(List<Employees> employee) {
		return emprepository.saveAll(employee);
	
	}
	
//	[ {  "empName": "aathi",
//	    "location": "haryana"
//	},
//	{   "empName": "kokila",
//	    "location": "malaysia"
//	},
//	{ "empName": "nadhiya",
//	    "location": "rajasthan"
//	}
//	]
	
	
}
