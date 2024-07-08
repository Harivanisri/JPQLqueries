package com.example.jql;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.jql.Entity.Employees;
import com.example.jql.Repository.EmployeeRepository;

@SpringBootTest
public class Tests {

	@Autowired
	private EmployeeRepository memberRepository;
	@Test
	public void findbylocation() {
		List<Employees> emp =   memberRepository.findByLocation("mumbai");
		System.out.println( "findBy Location  madurai "+ emp);
	}
	
	@Test
	public void findbyname() {
		List<Employees> emp =   memberRepository.findByEmpName("madhan");
		System.out.println( "find by name madhan  "+ emp);
	}
	
	@Test
	public void findbynameandlocation() {
		Employees emp =   memberRepository.findByEmpNameAndLocation("jaggu", "dolakpur").get();
		System.out.println( "findByEmpNameAndLocation "+ emp);
		
	}
	
	@Test
	public void finddistinctbylocation() {  
		List<Employees> emp =   memberRepository.findDistinctByLocation("jaipur");
		System.out.println("distinct by location jaipur " + emp);
	}
	
	@Test
	public void findbynameequals() {  
		List<Employees> emp =   memberRepository.findByEmpNameEquals("madhan");
		System.out.println("equals madhan " + emp);
	}
	
	@Test
	public void findbyidbetween() {  
		List<Employees> emp =   memberRepository.findByEmpIdBetween(1, 6);
		System.out.println("between 1 to 6" + emp);
	}
	
	@Test
	public void findbyidlessthan() {   //not include 4 
		List<Employees> emp =   memberRepository.findByEmpIdLessThan(4);
		System.out.println("less than 4" + emp);
	}
	
	@Test
	public void findbyidgreaterthanequal() {  
		List<Employees> emp =   memberRepository.findByEmpIdGreaterThanEqual(7);
		System.out.println("graterthanequal 7" + emp);
	}
	
	@Test
	public void findbynameafter() {  //skip letter start with a and after a 
		List<Employees> emp =   memberRepository.findByEmpNameAfter("aish");
		System.out.println("after aish " + emp);
	}
	@Test
	public void findbyidafter() {  //same greater than
		List<Employees> emp =   memberRepository.findByEmpIdAfter(9);
		System.out.println("after 9 " + emp);
	}
	@Test
	public void findbynamebefore() {  // skip n and display letters before n
		List<Employees> emp =   memberRepository.findByEmpNameBefore("nandhu");
		System.out.println("before aish " + emp);
	}
	
	@Test
	public void findbynamelike() {  // regex use startinwith endingwith Containing
		List<Employees> emp =   memberRepository.findByEmpNameLike("%a");
		System.out.println("like  a " + emp);
	}
	
	@Test
	public void findbynamenotlike() {  // working
		List<Employees> emp =   memberRepository.findByEmpNameNotLike("%a%");
		System.out.println("not like  a " + emp);
	}
	
	@Test
	public void findbylocationorderbynameasc() {  // 
		List<Employees> emp =   memberRepository.findByLocationOrderByEmpNameAsc("kerala");
		System.out.println("location order by name asc " + emp);
	}
	
//	@Test
//	public void findbyidin() {  // using collection
//		List<Integer> l = new ArrayList<Integer>();  l.add(3);l.add(5);
//		List<Employees> emp =   memberRepository.findByEmpIdIn(l);
//		System.out.println("id in  " + emp);
//	}
	@Test
	public void findbyidin() {  // using array
		int [] arr = {3,4,5,6,10};
		List<Employees> emp =   memberRepository.findByEmpIdIn(arr);
		System.out.println("id in  " + emp);
	}
	@Test
	public void findlocationignorecase() {  // using array
		List<Employees> emp =   memberRepository.findByLocationIgnoreCase("MAHARASTRA");
		System.out.println("ignorecase maharastra  " + emp);
	}
//	@Test
//	public void querydeletebyempname() {
//		List<Employees> emp = memberRepository.deletebyempName("vikram");
//		System.out.println();
//       System.out.println("deleted vikram" + emp);
//	}
	
	
//	@Test
//	public void updatequry() {
//		 memberRepository.updatebyempName("madhanraju", 4);
//		 System.out.println( memberRepository.findAll());
//	}
	
	@Test
	public void namecontaining() {
	List<Employees>	emp= memberRepository.findByEmpNameContaining("ram");
	System.out.println(emp);
	}
	
	
	
}
