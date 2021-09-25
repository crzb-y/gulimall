package com.bai.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bai.common.utils.PageUtils;
import com.bai.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author bai
 * @email sunlightcs@gmail.com
 * @date 2021-09-25 17:28:26
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

