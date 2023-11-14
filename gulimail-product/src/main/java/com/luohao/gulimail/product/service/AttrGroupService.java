package com.luohao.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohao.common.utils.PageUtils;
import com.luohao.gulimail.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-13 22:23:30
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

