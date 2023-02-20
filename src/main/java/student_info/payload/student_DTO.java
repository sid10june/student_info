package student_info.payload;



public class student_DTO {
	    private Long id;
	    private String name;
	    private String address;
	    private String email;
	    private String phoneno;
	    private String section;
	    private String grade;
	    
	    // Constructor
	    public student_DTO(Long id, String name, String address, String email, String phoneno, String section, String grade) {
	        this.id = id;
	        this.name = name;
	        this.address = address;
	        this.email = email;
	        this.phoneno = phoneno;
	        this.section = section;
	        this.grade = grade;
	    }
	    public student_DTO() {
	        // no-argument constructor
	    }
	    
	    // Getters and Setters
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
	    
	    public String getPhoneno() {
	        return phoneno;
	    }
	    
	    public void setPhoneNo(String phoneno) {
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


