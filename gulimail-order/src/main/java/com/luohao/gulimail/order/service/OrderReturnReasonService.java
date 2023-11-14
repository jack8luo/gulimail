package com.luohao.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohao.common.utils.PageUtils;
import com.luohao.gulimail.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-14 11:09:28
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

