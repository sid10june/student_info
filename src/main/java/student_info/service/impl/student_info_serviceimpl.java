package student_info.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student_info.entity.info;
import student_info.entity.marks;
import student_info.payload.student_DTO;
import student_info.repository.StudentRepository;
import student_info.repository.StudentmarksRepository;
import student_info.service.student_infoservice;

@Service
public class student_info_serviceimpl implements student_infoservice{

	@Autowired
	private ModelMapper mapper;
	@Autowired
	private StudentRepository studentrepo;
	@Autowired
	private StudentmarksRepository studentmarksrepo;

	
//	public student_DTO createinfo(student_DTO student_DTO) {
//		 info post = maptoEntity(student_DTO);
//	        studentrepo.save(post);
//		return null;
//	}
//
	public info maptoEntity(student_DTO Dto){
        info info = mapper.map(Dto, info.class);

         return info;
    }
	public student_DTO maptoDto(info post){
        student_DTO dto = mapper.map(post, student_DTO.class);
        return dto;
	}
 
	@Override
	public int createinfo(List<student_DTO> student_DTO) {
		 List<info> infoList = student_DTO.stream().map(student -> maptoEntity(student)).collect(Collectors.toList()); 
	        studentrepo.saveAll(infoList);
	        int size= infoList.size();
		return size; 
	}

	@Override
	public List<student_DTO> getStudents() {
		System.out.println("2");
		List<info> infos = studentrepo.findAll();
		System.out.println("3");
		 List<student_DTO> dtos = infos.stream().map(Info -> maptoDto(Info)).collect(Collectors.toList()); 
		 System.out.println("4");
		 return dtos;   
	}
	
	// 4th case
	@Override
	public Map<String, Object> getStudentDetails(Long id) {
		
	    Optional<marks> studentMarksOpt = studentmarksrepo.findById(id);
	    Optional<info> studentInfoOpt = studentrepo.findById(id);
	    
	    Map<String, Object> response = new HashMap<>();
	    
	    if (studentInfoOpt.isPresent() && studentMarksOpt.isPresent()) {
	    	
	        info studentInfo = studentInfoOpt.get(); 
	        marks studentMarks = studentMarksOpt.get();

	        
	        response.put("studentMarks", studentMarks);
	        response.put("studentInfo", studentInfo);
	    }
	    
	    
	    return response;
	}
	
}
