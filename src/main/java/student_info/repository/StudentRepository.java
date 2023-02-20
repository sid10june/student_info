package student_info.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import student_info.entity.info;

	@Repository
	public interface StudentRepository extends JpaRepository<info , Long> {
	    // add any custom repository methods here, if needed
	}

 

