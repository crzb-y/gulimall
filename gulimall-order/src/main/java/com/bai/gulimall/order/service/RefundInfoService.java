package com.bai.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bai.common.utils.PageUtils;
import com.bai.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author bai
 * @email sunlightcs@gmail.com
 * @date 2021-09-25 17:19:15
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

