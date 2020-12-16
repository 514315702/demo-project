package mapper;

import entity.Course;

import java.util.List;

public interface CourseMapper {

	List<Course> findList(Course course);
}
