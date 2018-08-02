package com.haomostudio.SpringMVCTemplate.service.impl;


import com.haomostudio.SpringMVCTemplate.dao.AuthTokenMapper;
import com.haomostudio.SpringMVCTemplate.dao.HmUserMapper;
import com.haomostudio.SpringMVCTemplate.HmUser;
import com.haomostudio.SpringMVCTemplate.service.HmUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
* Created by hxgqh on 2016/1/7.
*/
@Service("hmUserService")
public class HmUserServiceImpl implements HmUserService {
    protected static final Logger LOG = LoggerFactory.getLogger(HmUserServiceImpl.class);

    @Autowired
    HmUserMapper hmUserMapper;

    @Autowired
    AuthTokenMapper authTokenMapper;

    @Override
    public int create(HmUser item) {
        return hmUserMapper.insertSelective(item);
    }

    @Override
    public int update(HmUser item) {
        return hmUserMapper.updateByPrimaryKeySelective(item);
    }

    @Override
    public HmUser get(String id) {
        return hmUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<HmUser> getListWithPagingAndFilter(Integer pageNo, Integer pageSize, String sortItem, String sortOrder, String filters) {
        return null;
    }

}
