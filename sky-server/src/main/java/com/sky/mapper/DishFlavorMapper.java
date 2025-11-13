package com.sky.mapper;

import com.sky.annotation.AutoFill;
import com.sky.entity.DishFlavor;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    /**
     * 插入菜品口味
     *
     * @param dishFlavors
     */
    void insertBatch(List<DishFlavor> dishFlavors);

    /**
     * 按菜品id批量删除对应口味
     *
     * @param dishIds
     */
    void deleteByDishIds(List<Long> dishIds);

    /**
     * 按菜品id查找对应口味
     *
     * @param dishId
     * @return
     */
    @Select("select id, dish_id, name, value from dish_flavor where dish_id = #{dishId}")
    List<DishFlavor> getByDishId(Integer dishId);

    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);
}
