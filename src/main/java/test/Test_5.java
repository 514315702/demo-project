package test;


import entity.Employee;
import mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * employee 表包含所有员工信息，每个员工有其对应的工号id，姓名name，工资salary和部门编号department_id
 * department 表包含公司所有部门的信息, 字段 部门ID 和 部门名name
 */
public class Test_5 {

	private SqlSessionFactory factory;
	private SqlSession sqlSession;

	@Before
	public void setUp() throws Exception {
		factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
		sqlSession = factory.openSession(true); // 自动提交事务
	}
	@After
	public void closeSession(){
		sqlSession.close();
	}

	/**
	 * 第一题：找出工资大于8000的员工信息及部门信息
	 */
	@Test
	public void wagesGreaterThan(){
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		employeeMapper.wagesGreaterThan().forEach(System.out::println);
	}

	/**
	 * 找出每个部门获得前三高工资的所有员工
	 */
	@Test
	public void wagesHighest(){
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
	}

	/**
	 *  请添加1000名员工到员工表中
	 */
	@Test
	public void insertEmployee(){
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		List<Employee>  list = new ArrayList<>();
		employeeMapper.insertEmployee(list);

	}
}
