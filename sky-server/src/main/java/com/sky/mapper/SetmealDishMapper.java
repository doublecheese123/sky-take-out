package com.sky.mapper;

import com.sky.entity.SetmealDish;
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

    /**
     * 插入套餐和菜品的对应关系
     *
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);
}
