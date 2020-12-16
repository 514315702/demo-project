package mapper;

import entity.Student;
import entity.Teacher;

import java.util.List;

public interface TeacherMapper {
	List<Teacher> findList(Teacher teacher);
}
