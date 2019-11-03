package com.lin.mall.service.impl;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Service;
import com.lin.mall.bean.UmsMember;
import com.lin.mall.mapper.UmsMemberMapper;
import com.lin.mall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * description
 *
 * @author lin.luo@hand-china.com
 * @date 2019/11/1 14:29
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    @Autowired
    private UmsMemberMapper umsMemberMapper;
    @Override
    public List<UmsMember> getAllMember() {
        return umsMemberMapper.selectAll();
    }
}
