package entity;

/**
 * 老师信息
 */

public class Teacher {
	/**老师编号*/
	private String teacherNumber;
	/**老师名*/
	private String teacherName;


	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"teacherNumber='" + teacherNumber + '\'' +
				", teacherName='" + teacherName + '\'' +
				'}';
	}
}
