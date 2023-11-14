package com.luohao.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohao.common.utils.PageUtils;
import com.luohao.gulimail.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-14 11:12:50
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

