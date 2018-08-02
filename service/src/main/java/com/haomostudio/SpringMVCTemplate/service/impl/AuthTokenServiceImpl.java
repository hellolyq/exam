package com.haomostudio.SpringMVCTemplate.service.impl;


import com.haomostudio.SpringMVCTemplate.AuthToken;
import com.haomostudio.SpringMVCTemplate.service.AuthTokenService;
import com.haomostudio.SpringMVCTemplate.dao.AuthTokenMapper;
import com.haomostudio.SpringMVCTemplate.dao.HmUserMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


/**
* Created by hxgqh on 2016/1/7.
*/
@Service("authTokenService")
public class AuthTokenServiceImpl implements AuthTokenService {
    protected static final Logger LOG = LoggerFactory.getLogger(AuthTokenServiceImpl.class);

    @Autowired
    HmUserMapper hmUserMapper;

    @Autowired
    AuthTokenMapper authTokenMapper;


    @Override
    public int create(AuthToken item) {
        return authTokenMapper.insertSelective(item);
    }

    @Override
    public int delete(String id) {
        return authTokenMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int update(AuthToken item) {
        return authTokenMapper.updateByPrimaryKeySelective(item);
    }

    @Override
    public AuthToken get(String id) {
        return authTokenMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<AuthToken> getListWithPagingAndFilter(Integer pageNo, Integer pageSize, String sortItem, String sortOrder, String filters) {
        return null;
    }

    @Override
    public Object getListWithPagingAndFilter(Integer pageNo, Integer pageSize, String sortItem, String sortOrder, String filters, String includes, String refers, String relates) {
        return null;
    }

    @Override
    public Long countListWithPagingAndFilter(String filters) {
        return null;
    }

}
