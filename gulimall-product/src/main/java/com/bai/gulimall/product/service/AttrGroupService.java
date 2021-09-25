package com.bai.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bai.common.utils.PageUtils;
import com.bai.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author bai
 * @email sunlightcs@gmail.com
 * @date 2021-09-25 17:28:27
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

