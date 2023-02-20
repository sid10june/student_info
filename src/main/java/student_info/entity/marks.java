package student_info.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_marks")

public class marks {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// private info stuinfo;
	@Column(name = "session", length = 9)
	private String session;

	@Column(name = "semester", length = 3)
	private String semester;

	@Column(name = "total_subject")
	private int totalSubject;

	@Column(name = "total_marks")
	private int totalMarks;

	public marks() {
		// no-argument constructor
	}

	public marks(Long id, String session, String semester, int totalSubject, int totalMarks) {
		this.id = id;
		this.session = session;
		this.semester = semester;
		this.totalSubject = totalSubject;
		this.totalMarks = totalMarks;
	}
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public int getTotalSubject() {
		return totalSubject;
	}

	public void setTotalSubject(int totalSubject) {
		this.totalSubject = totalSubject;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	// getters and setters

}
