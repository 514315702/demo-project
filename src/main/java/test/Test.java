package test;

import entity.*;
import mapper.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;

/**
 * 此为测试连接案例
 */

public class Test {

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

	@org.junit.Test
	public void findListStudent(){
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		studentMapper.findList(new Student()).forEach(System.out::println);

	}

	@org.junit.Test
	public void findListTeacher(){
		TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
		teacherMapper.findList(new Teacher()).forEach(System.out::println);
	}

	@org.junit.Test
	public void findListDepartment(){
		DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
		departmentMapper.findList(new Department()).forEach(System.out::println);
	}


	@org.junit.Test
	public void findListCourse(){
		CourseMapper courseMapper = sqlSession.getMapper(CourseMapper.class);
		courseMapper.findList(new Course()).forEach(System.out::println);

	}

	@org.junit.Test
	public void findListEmployee(){
		EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
		employeeMapper.findList(new Employee()).forEach(System.out::println);

	}

	@org.junit.Test
	public void findListAchievement(){
		AchievementMapper achievementMapper = sqlSession.getMapper(AchievementMapper.class);
		achievementMapper.findList(new Achievement()).forEach(System.out::println);

	}
}
