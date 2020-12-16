package mapper;

import entity.Student;

import java.util.List;

public interface StudentMapper {

	List<Student> findList(Student student);

	List<Student > findAvg();

	List<Student > findScore();

	List<Student> findScoreSecond();
}
