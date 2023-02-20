package student_info.payload;

public class marks_DTO {
	private Long id;

	private String session;

	private String semester;

	private int totalSubject;

	private int totalMarks;

	public marks_DTO() {
		// no-argument constructor
	}

	public marks_DTO(Long id, String session, String semester, int totalSubject, int totalMarks) {
		this.id = id;
		this.session = session;
		this.semester = semester;
		this.totalSubject = totalSubject;
		this.totalMarks = totalMarks;
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

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
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

}
