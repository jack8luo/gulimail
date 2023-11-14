package com.luohao.gulimail.order.dao;

import com.luohao.gulimail.order.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-14 11:09:28
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
