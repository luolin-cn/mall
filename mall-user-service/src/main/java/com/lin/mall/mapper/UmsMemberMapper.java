package com.lin.mall.mapper;

import java.util.List;

import com.lin.mall.bean.UmsMember;
import tk.mybatis.mapper.common.BaseMapper;

/**
 * description
 *
 * @author lin.luo@hand-china.com
 * @date 2019/11/1 14:30
 */
public interface UmsMemberMapper extends BaseMapper<UmsMember> {
    List<UmsMember> selectAllMember();
}
