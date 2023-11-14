package com.luohao.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohao.common.utils.PageUtils;
import com.luohao.gulimail.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-13 22:23:30
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

