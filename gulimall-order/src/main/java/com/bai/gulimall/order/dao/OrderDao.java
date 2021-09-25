package com.bai.gulimall.order.dao;

import com.bai.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author bai
 * @email sunlightcs@gmail.com
 * @date 2021-09-25 17:19:15
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
