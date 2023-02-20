package student_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import student_info.entity.marks;

@Repository
public interface StudentmarksRepository extends JpaRepository<marks , Long> {

}
