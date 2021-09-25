package com.bai.gulimall.product.dao;

import com.bai.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author bai
 * @email sunlightcs@gmail.com
 * @date 2021-09-25 17:28:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
