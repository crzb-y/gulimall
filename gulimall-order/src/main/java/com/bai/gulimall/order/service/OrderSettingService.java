package com.bai.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bai.common.utils.PageUtils;
import com.bai.gulimall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author bai
 * @email sunlightcs@gmail.com
 * @date 2021-09-25 17:19:15
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

