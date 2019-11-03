package com.lin.mall.controller;

import java.util.List;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lin.mall.bean.UmsMember;
import com.lin.mall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description
 *
 * @author lin.luo@hand-china.com
 * @date 2019/11/1 14:28
 */
@RestController
@RequestMapping("/ums-member")
public class UmsMemberController {
    @Reference
    private UmsMemberService umsMemberService;
    @GetMapping("/all")
    public List<UmsMember> getAllMember(){
        return umsMemberService.getAllMember();
    }
}
