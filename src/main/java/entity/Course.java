package entity;

/**
 * 课程表
 */
public class Course {
	/**课程编号*/
	private String courseNumber;
	/**课程名*/
	private String courseName;
	/**老师编号*/
	private String teacherNumber;

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	@Override
	public String toString() {
		return "Course{" +
				"courseNumber='" + courseNumber + '\'' +
				", courseName='" + courseName + '\'' +
				", teacherNumber='" + teacherNumber + '\'' +
				'}';
	}
}
