package mapper;

import entity.Department;

import java.util.List;

public interface DepartmentMapper {

	List<Department> findList(Department department);
 }
