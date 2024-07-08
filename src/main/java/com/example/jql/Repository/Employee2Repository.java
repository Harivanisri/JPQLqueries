package com.example.jql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jql.Entity.Employees2;

@Repository
public interface Employee2Repository extends JpaRepository<Employees2,Integer>{

}
