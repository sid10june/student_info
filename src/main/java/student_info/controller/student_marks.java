package student_info.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student_info.payload.marks_DTO;
import student_info.service.student_markservice;

@RestController
@RequestMapping("/student/marks/detail")
public class student_marks { 

	@Autowired
	private student_markservice studentmarks;
	 @PostMapping
	    public String createPost(@RequestHeader("operation") String operation,@RequestBody marks_DTO marks_DTO){  
		
		 if ("insert".equals(operation)) { 
			 String msg=studentmarks.createmarks(marks_DTO); 
	     return msg;
		 } 
		return null;
	     } 
	
	
}
