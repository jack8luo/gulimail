package com.luohao.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohao.common.utils.PageUtils;
import com.luohao.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-14 11:09:28
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

