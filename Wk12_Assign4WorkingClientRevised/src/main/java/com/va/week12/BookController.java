package com.va.week12;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.va.week12.model.Book;


@Controller
public class BookController {


	       @RequestMapping("/index")
	       public String home()
	       {
	       return "index";
	       }

	      @PostMapping("/addBook")
	public @ResponseBody String add(
			@RequestParam("empId") int empId,
	@RequestParam("empName") String empName,

	      @RequestParam("jobTitle") String jobTitle,
	      @RequestParam("salary") double salary,
	      @RequestParam("deptNo") String deptNo)
	{
	// add the code to json parsing here..
	 
	    	  ObjectMapper objectMapper = new ObjectMapper();
	    	  
	    	 // modify as per pojo---- 
	    	  //Book book1 = new Book(empId, empName, jobTitle, salary);
	    	  File f1 = new File("target/book1.json");
	    	  objectMapper.writeValue(f1, book1);    	  
	    	  
	    	  
	return "An employee info added";
	}

	      @RequestMapping("/edit")
	      public String Modify()
	      {
	                return "edit";
	      }

	      @PostMapping("/update")
	      public @ResponseBody String edit(@RequestParam("empId") int empId,
	      @RequestParam("empName") String empName,
	      @RequestParam("jobTitle") String jobTitle,
	      @RequestParam("salary") double salary,
	      @RequestParam("deptNo") int deptNo)
	{     return "updated";
		// code for json parsing here..
	}

	      @RequestMapping("/show")
	      public String show(Model model)
	{
	      // code for json parsing here...
	      return "show";
	      }

}
