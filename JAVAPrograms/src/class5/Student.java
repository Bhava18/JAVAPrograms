package class5;

public class Student {
	private String studentName="Bhavadharani";
	private String rollNo="18PH104";
	private int age=20;
	private String dob="18.11.2001";
	private int tamilMarks=97;
	private int engMarks=91;
	private int matMarks=100;
	private int scienceMarks=98;
	private int socialmarks=100; 
	private int totalMarks=485;
	
	public String getStudentName() {// retrieving data
		return studentName;
	}
	public void setStudentName(String studentName) {//passing data to that variables
		
		this.studentName = studentName;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getTamilMarks() {
		return tamilMarks;
	}
	public void setTamilMarks(int tamilMarks) {
		this.tamilMarks = tamilMarks;
	}
	public int getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}
	public int getMatMarks() {
		return matMarks;
	}
	public void setMatMarks(int matMarks) {
		this.matMarks = matMarks;
	}
	public int getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(int scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public int getSocialmarks() {
		return socialmarks;
	}
	public void setSocialmarks(int socialmarks) {
		this.socialmarks = socialmarks;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
}
	
	