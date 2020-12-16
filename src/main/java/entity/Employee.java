package entity;

/**
 *员工表
 */
public class Employee {
	/**id*/
	private Integer id;
	/**员工名*/
	private String name;
	/**员工薪资*/
	private Integer salary;
	/**部门名*/
	private Integer departmentId;

	private String departmentName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", name='" + name + '\'' +
				", salary=" + salary +
				", departmentId=" + departmentId +
				", departmentName='" + departmentName + '\'' +
				'}';
	}
}
