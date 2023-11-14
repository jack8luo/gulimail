package com.luohao.gulimail.member.dao;

import com.luohao.gulimail.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-14 14:17:49
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
