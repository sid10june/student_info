package student_info.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import student_info.entity.info;
import student_info.entity.marks;
import student_info.payload.marks_DTO;
import student_info.repository.StudentRepository;
import student_info.repository.StudentmarksRepository;
import student_info.service.student_markservice;

@Service
public class student_marks_serviceimpl implements student_markservice {

	@Autowired
	private StudentmarksRepository studentmarksrepo;
	@Autowired
	private StudentRepository studentrepo;

	@Override
	public String createmarks(marks_DTO marks_DTO) {

		Long studentId = marks_DTO.getId();
		Optional<info> studentOpt = studentrepo.findById(studentId);

		if (studentOpt.isPresent()) {
			marks studentMarks = new marks();
			studentMarks.setId(marks_DTO.getId());
			studentMarks.setSession(marks_DTO.getSession());
			studentMarks.setSemester(marks_DTO.getSemester());
			studentMarks.setTotalSubject(marks_DTO.getTotalSubject());
			studentMarks.setTotalMarks(marks_DTO.getTotalMarks());
			studentmarksrepo.save(studentMarks);
			String msg="record inserted successfully " + " code:00";
			return msg ;
		} else {
			String msg="record inserted fail" + " code:99";

			return msg; 
		}

	}



}
