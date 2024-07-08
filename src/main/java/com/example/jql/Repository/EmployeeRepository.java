package com.example.jql.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.jql.Entity.Employees;
import com.example.jql.Entity.Employees2;


@Repository
public interface EmployeeRepository extends JpaRepository<Employees,Integer> {
	
	List <Employees> findByEmpNameContaining(String name);
	
	
	
	
	
	
	
	
	
	
	
	

	List <Employees> findByLocation(String Location);
	List <Employees> findByEmpName(String EmpName);
	Optional<Employees>findByEmpNameAndLocation(String EmpName , String Location);
	List <Employees> findDistinctByLocation(String Location);
	
	List <Employees> findByEmpNameEquals(String EmpName);
	List <Employees> findByEmpIdBetween(int EmpId , int EmpId2);
	List <Employees> findByEmpIdLessThan(int id);
	List <Employees> findByEmpIdGreaterThanEqual(int id);
	List <Employees> findByEmpNameAfter(String id);
	List <Employees> findByEmpNameBefore(String id);
	List <Employees> findByEmpIdAfter(int id);
	
	
	
	List <Employees>  findByEmpNameLike(String name);
	
	List <Employees>  findByEmpNameNotLike(String name);
	
	List <Employees>  findByLocationOrderByEmpNameAsc(String location);
	
	//List <Employees>  findByEmpIdIn(Collection<Integer> id);
	List <Employees>  findByEmpIdIn(int [] arr);
	
	List <Employees> findByLocationIgnoreCase(String location);
	
	
//	@Modifying
//	@Query("delete from Employees e where e.empName=?1")
//	List<Employees> deletebyempName(String name);
//	
//	@Modifying
//	@Query("update Employees e set e.empName=?1 where e.empId=?2")
//	void updatebyempName(String name,int id);
	
	
	

}

