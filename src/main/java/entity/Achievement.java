package entity;

/**
 * 学院课程中间表
 */
public class Achievement {

	/**学生编号*/
	private String studentNumber;
	/**课程编号*/
	private String courseNumber;
	/**学生分值*/
	private Float score;

	private Float maxScore;

	private Float minScore;

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public Float getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Float maxScore) {
		this.maxScore = maxScore;
	}

	public Float getMinScore() {
		return minScore;
	}

	public void setMinScore(Float minScore) {
		this.minScore = minScore;
	}

	@Override
	public String toString() {
		return "Achievement{" +
				"studentNumber='" + studentNumber + '\'' +
				", courseNumber='" + courseNumber + '\'' +
				", score=" + score +
				", maxScore=" + maxScore +
				", minScore=" + minScore +
				'}';
	}
}
