package com.haomostudio.SpringMVCTemplate.dao;

import com.haomostudio.SpringMVCTemplate.AuthToken;


public interface AuthTokenMapper {

    int deleteByPrimaryKey(String id);

    int insert(AuthToken record);

    int insertSelective(AuthToken record);

    AuthToken selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(AuthToken record);

    int updateByPrimaryKey(AuthToken record);
}