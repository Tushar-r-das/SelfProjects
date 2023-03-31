package com.springmongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.api.model.Employees;
import com.springmongo.api.repository.EmployeeRepository;

@RestController
//@RequestMapping(value="/api")
public class EmployeeController {
     @Autowired
	private EmployeeRepository repository;
     
     @PostMapping ("/addEmployee")
     public String saveEmployee (@RequestBody Employees employee ) {
    	 repository.save(employee);
    	 return "Added the Employee with Id: " + employee.getId() ;
     }
     @GetMapping ("/findAllEmployees")
     public List<Employees>getEmployees(){
    	 return repository.findAll();
     }
     @GetMapping ("/findEmployeebyId/{id}")
     public Optional <Employees> getEmployee(@PathVariable int id){
    	 return repository.findById(id);
     }
     @DeleteMapping ("/delete/{id}")
     public String deleteEmployee(@PathVariable int id) {
    	 repository.deleteById(id);
    	 return "Deleted the Employee";
     }
     
}
