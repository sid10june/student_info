package student_info.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "student_info", uniqueConstraints = { @UniqueConstraint(columnNames = { "std_id" }) })
public class info {
	@Id
	@Column(name = "std_id", nullable = false)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "std_name", nullable = false, length = 250)
	private String name;
	@Column(name = "std_address", nullable = false, length = 500)
	private String address;
	@Column(name = "std_email", nullable = false, length = 100)
	private String email;
	@Column(name = "std_phoneNo", nullable = false, length = 10)
	private String phoneno;
	@Column(name = "std_section", nullable = false, length = 03)
	private String section;
	@Column(name = "std_grade", nullable = false, length = 6)
	private String grade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
