package com.luohao.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luohao.common.utils.PageUtils;
import com.luohao.gulimail.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author luohao
 * @email 18779121256@163.com
 * @date 2023-11-14 14:17:48
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

