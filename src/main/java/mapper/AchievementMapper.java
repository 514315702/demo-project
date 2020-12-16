package mapper;

import entity.Achievement;

import java.util.List;


public interface AchievementMapper {

	List<Achievement> findList(Achievement achievement);

	List<Achievement> findMaxAndMin();

}
