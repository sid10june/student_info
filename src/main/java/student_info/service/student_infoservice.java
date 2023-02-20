package student_info.service;

import java.util.List;
import java.util.Map;

import student_info.payload.student_DTO;

public interface student_infoservice {
 

	int createinfo(List<student_DTO> student_DTO);

	List<student_DTO> getStudents();

	Map<String, Object> getStudentDetails(Long id);


}
