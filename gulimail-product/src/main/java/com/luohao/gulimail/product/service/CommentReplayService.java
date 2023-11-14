package com.luohao.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohao.common.utils.PageUtils;
import com.luohao.gulimail.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-13 22:23:30
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

