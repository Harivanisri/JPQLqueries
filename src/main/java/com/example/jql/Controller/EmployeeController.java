package com.example.jql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jql.Entity.Employees;
import com.example.jql.Entity.Employees2;
import com.example.jql.Service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
private EmployeeService empservice;

	
	//using single data insert into two table 
		@PostMapping
		@RequestMapping("/post")
		public Employees2 addEmployee2(@RequestBody Employees employee) {
			return empservice.addemp2(employee);
		}
		
		@GetMapping("/{name}")
		public List<Employees> namelike(@PathVariable("name") String name){
			return empservice.namelike(name);
		}
		
		
		
	
	@PostMapping
	@RequestMapping("/saveall")
	public List<Employees>  saveall(@RequestBody List<Employees> employee){
		return empservice.saveall(employee);
	}
	
	
	
	
//@PostMapping
//public Employees addEmployee(@RequestBody Employees employee) {
//	return empservice.addEmployee(employee);
//}

@DeleteMapping
@RequestMapping("/{id}")
public String deletebyid(@PathVariable("id")int id) {
	return empservice.deletebyid(id);
}

@PutMapping("/{idd}")
public Employees update(@PathVariable("idd")int empid,@RequestBody Employees employee) {

return empservice.updateEmployee(empid, employee);
}
}
