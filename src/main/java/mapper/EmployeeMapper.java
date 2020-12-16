package mapper;

import entity.Employee;

import java.util.List;

public interface EmployeeMapper {

	List<Employee> findList(Employee employee);

	List<Employee> wagesGreaterThan();

	int insertEmployee(List<Employee> list);
}
