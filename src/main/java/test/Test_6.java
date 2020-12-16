package test;


import mapper.AchievementMapper;
import mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 1.student 学生表
 * 2.teacher 老师表
 * 3.achievement 成绩表
 * 4.course 课程表
 *
 * 表结构自己进数据库查看(本地)
 */
public class Test_6 {

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
	 *查询各科成绩最高分和最低分
	 */
	@Test
	public void findMaxAndMin(){
		AchievementMapper achievementMapper = sqlSession.getMapper(AchievementMapper.class);
		achievementMapper.findMaxAndMin().forEach(System.out::println);
	}

	/**
	 * 查询平均分大于80分的
	 */
	@Test
	public void findAvg(){
		StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
		studentMapper.findAvg().forEach(System.out::println);
	}

	/**
	 *查询所有课程成绩大于等于60分学生的学号、姓名
	 */
	@Test
	public  void findScore(){
		StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
		studentMapper.findScore().forEach(System.out::println);
	}

	/**
	 * 查询出只选修了两门课程的全部学生的学号和姓名
	 */
	@Test
	public void findScoreSecond(){
		StudentMapper studentMapper= sqlSession.getMapper(StudentMapper.class);
		studentMapper.findScoreSecond().forEach(System.out::println);
	}

}
