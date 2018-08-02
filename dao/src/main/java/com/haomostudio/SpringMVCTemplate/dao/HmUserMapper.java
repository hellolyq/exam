package com.haomostudio.SpringMVCTemplate.dao;


import com.haomostudio.SpringMVCTemplate.HmUser;


public interface HmUserMapper {

    int deleteByPrimaryKey(String id);

    int insert(HmUser record);

    int insertSelective(HmUser record);

    HmUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(HmUser record);

    int updateByPrimaryKey(HmUser record);
}