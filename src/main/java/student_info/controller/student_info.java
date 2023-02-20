package student_info.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student_info.payload.student_DTO;
import student_info.service.student_infoservice;
import student_info.service.student_markservice;

@RestController
@RequestMapping("/student/details")
public class student_info {
	@Autowired
	private student_infoservice studentservice; 
//	@Autowired
//	private student_markservice studentmarks;
	
	
	 @PostMapping 
	    public ResponseEntity<Object> createPost(@RequestHeader("operation") String operation,@RequestBody List<student_DTO> student_DTO){  
		
		 if ("insert".equals(operation)) {
		 int size= studentservice.createinfo(student_DTO);
	     return new ResponseEntity<>("message: "+size +" record inserted sucussfully"+" code:00", HttpStatus.CREATED);
		 }
		return null;
	     }
	 
	 @GetMapping
	 public ResponseEntity<List<student_DTO>> getStudentDetails(@RequestHeader("operation") String operation) {
		 if ("read".equals(operation)) {
			 System.out.println("1");
		 List<student_DTO> students = studentservice.getStudents();
		 System.out.println("final...12");
	        return ResponseEntity.ok(students);
		 }  
		return null;
	 } 
	 @GetMapping("/{id}") 
	 public ResponseEntity<Map<String, Object>> getStudentDetails(@PathVariable Long id,@RequestHeader("operation") String operation) {
		 if ("read".equals(operation)) {
			 Map<String, Object> response = studentservice.getStudentDetails(id);
		     return ResponseEntity.ok(response);
		 }
		return null;

		 
	 } 


}
