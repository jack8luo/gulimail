package com.luohao.gulimail.member.dao;

import com.luohao.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-14 14:17:48
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
