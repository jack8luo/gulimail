package com.luohao.gulimail.product.dao;

import com.luohao.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-13 22:23:30
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
