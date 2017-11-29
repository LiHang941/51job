package xyz.lihang.utils.job.db.mapper;

import java.util.List;
import xyz.lihang.utils.job.db.entity.Position;

public interface PositionMapper {
    /**
     * 本方法对应的数据表为 position
     * @param id id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 本方法对应的数据表为 position
     * @param record record
     */
    int insert(Position record);

    /**
     * 本方法对应的数据表为 position
     * @param id id
     */
    Position selectByPrimaryKey(Long id);

    /**
     * 本方法对应的数据表为 position
     */
    List<Position> selectAll();

    /**
     * 本方法对应的数据表为 position
     * @param record record
     */
    int updateByPrimaryKey(Position record);
}