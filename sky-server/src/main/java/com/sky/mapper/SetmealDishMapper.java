package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 查询要删除的菜品是否被套餐关联
     *
     * @param dishIds
     * @return
     */
    Integer getByDishIds(List<Long> dishIds);

}
