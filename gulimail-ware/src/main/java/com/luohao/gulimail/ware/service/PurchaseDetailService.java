package com.luohao.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohao.common.utils.PageUtils;
import com.luohao.gulimail.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-14 14:22:17
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

