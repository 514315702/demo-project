package entity;

import java.util.Date;

/**
 * 学生信息
 */
public class Student {

	/**学生编号*/
	private String studentNumber;
	/**学生名*/
	private String studentName;
	/**学生生日*/
	private Date studentBirth;
	/**学生性别*/
	private String studentSex;

	/**分值*/
	private Integer score;



	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getStudentBirth() {
		return studentBirth;
	}

	public void setStudentBirth(Date studentBirth) {
		this.studentBirth = studentBirth;
	}

	public String getStudentSex() {
		return studentSex;
	}

	public void setStudentSex(String studentSex) {
		this.studentSex = studentSex;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student{" +
				"studentNumber='" + studentNumber + '\'' +
				", studentName='" + studentName + '\'' +
				", studentBirth=" + studentBirth +
				", studentSex='" + studentSex + '\'' +
				", score=" + score +
				'}';
	}
}
