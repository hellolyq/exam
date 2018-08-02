package com.haomostudio.SpringMVCTemplate.controller;

import com.haomostudio.SpringMVCTemplate.HmUser;
import com.haomostudio.SpringMVCTemplate.service.HmUserService;
import com.haomostudio.SpringMVCTemplate.service.HmUtils.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @ClassName HmUserController
 * @Description TODO
 * @Author Liuyanqiang
 * @Date 2018-8-2 20:12
 * @Version V1.0
 */
@Controller
public class HmUserController {

    @Autowired
    HmUserService hmUserService;

    @ResponseBody
    @RequestMapping(value = "/hm_users/new",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public Object createUser(HttpServletRequest request){

        /**
         * 获取前台参数
         */
        String token = request.getParameter("X-Auth-Token");
        String username = request.getParameter("username");
        String loginid = request.getParameter("loginid");
        String password = request.getParameter("password");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String avatar = request.getParameter("avatar");
        String createTime = request.getParameter("createTime");
        String lastUpdateTime = request.getParameter("lastUpdateTime");
        String lastLoginTime = request.getParameter("lastLoginTime");
        String departmentCode = request.getParameter("departmentCode");
        String roleId = request.getParameter("roleId");
        Integer meetingRemindingTime = Integer.valueOf(request.getParameter("meetingRemindingTime"));
        String jobTitle = request.getParameter("jobTitle");
        String phoneNumber = request.getParameter("phoneNumber");
        String phoneNumberSpare = request.getParameter("phoneNumberSpare");
        Integer rank = Integer.valueOf(request.getParameter("rank"));
        String community = request.getParameter("community");
        String enable = request.getParameter("enable");
        String hide = request.getParameter("hide");
        String departmentId = request.getParameter("departmentId");
        String code = request.getParameter("code");



        //添加入表
        HmUser user = new HmUser();
        String id = Tools.getUUID();
        user.setId(id);
        if( username != null ){
            user.setUsername(username);
        }
        if( loginid != null ){
            user.setLoginid(loginid);
        }
        if( password != null ){
            user.setPassword(password);
        }
        if( mobile != null ){
            user.setMobile(mobile);
        }
        if( email != null ){
            user.setEmail(email);
        }
        if( avatar != null ){
            user.setAvatar(avatar);
        }
        user.setCreateTime(new Date());
        user.setLastUpdateTime(new Date());
        if( lastLoginTime != null ){
            user.setLastLoginTime(Tools.convertStringToDate(lastLoginTime, "yyyy-MM-dd HH:mm:ss"));
        }
        if( departmentCode != null ){
            user.setDepartmentCode(departmentCode);
        }
        if( roleId != null ){
            user.setRoleId(roleId);
        }
        if( meetingRemindingTime != null ){
            user.setMeetingRemindingTime(meetingRemindingTime);
        }
        if( jobTitle != null ){
            user.setJobTitle(jobTitle);
        }
        if( phoneNumber != null ){
            user.setPhoneNumber(phoneNumber);
        }
        if( phoneNumberSpare != null ){
            user.setPhoneNumberSpare(phoneNumberSpare);
        }
        if( rank != null ){
            user.setRank(rank);
        }
        if( community != null ){
            user.setCommunity(community);
        }
        if( enable != null ){
            user.setEnable(enable);
        }
        if( hide != null ){
            user.setHide(hide);
        }
        if( departmentId != null ){
            user.setDepartmentId(departmentId);
        }
        if( code != null ){
            user.setCode(code);
        }

        hmUserService.create(user);

        return hmUserService.get(id);

    }
    @ResponseBody
    @RequestMapping(value = "/hm_users/{hm_user_id}/edit",
            method = RequestMethod.POST,
            produces = "application/json;charset=UTF-8")
    public Object updateUser( HttpServletRequest request){

        /**
         * 获取前台参数
         */
        String token = request.getParameter("X-Auth-Token");
        String username = request.getParameter("username");
        String loginid = request.getParameter("loginid");
        String password = request.getParameter("password");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String avatar = request.getParameter("avatar");
        String createTime = request.getParameter("createTime");
        String lastUpdateTime = request.getParameter("lastUpdateTime");
        String lastLoginTime = request.getParameter("lastLoginTime");
        String departmentCode = request.getParameter("departmentCode");
        String roleId = request.getParameter("roleId");
        Integer meetingRemindingTime = Integer.valueOf(request.getParameter("meetingRemindingTime"));
        String jobTitle = request.getParameter("jobTitle");
        String phoneNumber = request.getParameter("phoneNumber");
        String phoneNumberSpare = request.getParameter("phoneNumberSpare");
        Integer rank = Integer.valueOf(request.getParameter("rank"));
        String community = request.getParameter("community");
        String enable = request.getParameter("enable");
        String hide = request.getParameter("hide");
        String departmentId = request.getParameter("departmentId");
        String code = request.getParameter("code");



        //添加入表
        HmUser user = new HmUser();
        String id = Tools.getUUID();
        user.setId(id);
        if( username != null ){
            user.setUsername(username);
        }
        if( loginid != null ){
            user.setLoginid(loginid);
        }
        if( password != null ){
            user.setPassword(password);
        }
        if( mobile != null ){
            user.setMobile(mobile);
        }
        if( email != null ){
            user.setEmail(email);
        }
        if( avatar != null ){
            user.setAvatar(avatar);
        }
        user.setCreateTime(new Date());
        user.setLastUpdateTime(new Date());
        if( lastLoginTime != null ){
            user.setLastLoginTime(Tools.convertStringToDate(lastLoginTime, "yyyy-MM-dd HH:mm:ss"));
        }
        if( departmentCode != null ){
            user.setDepartmentCode(departmentCode);
        }
        if( roleId != null ){
            user.setRoleId(roleId);
        }
        if( meetingRemindingTime != null ){
            user.setMeetingRemindingTime(meetingRemindingTime);
        }
        if( jobTitle != null ){
            user.setJobTitle(jobTitle);
        }
        if( phoneNumber != null ){
            user.setPhoneNumber(phoneNumber);
        }
        if( phoneNumberSpare != null ){
            user.setPhoneNumberSpare(phoneNumberSpare);
        }
        if( rank != null ){
            user.setRank(rank);
        }
        if( community != null ){
            user.setCommunity(community);
        }
        if( enable != null ){
            user.setEnable(enable);
        }
        if( hide != null ){
            user.setHide(hide);
        }
        if( departmentId != null ){
            user.setDepartmentId(departmentId);
        }
        if( code != null ){
            user.setCode(code);
        }

        hmUserService.update(user);

        return hmUserService.get(id);
    }

    @RequestMapping(value = "/hm_users/{hm_user_id}",
            method = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT},
            produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object getUser(HttpServletRequest request){

        /**
         * 获取前台参数
         */
        String token = request.getParameter("X-Auth-Token");
        String username = request.getParameter("username");
        String loginid = request.getParameter("loginid");
        String password = request.getParameter("password");
        String mobile = request.getParameter("mobile");
        String email = request.getParameter("email");
        String avatar = request.getParameter("avatar");
        String createTime = request.getParameter("createTime");
        String lastUpdateTime = request.getParameter("lastUpdateTime");
        String lastLoginTime = request.getParameter("lastLoginTime");
        String departmentCode = request.getParameter("departmentCode");
        String roleId = request.getParameter("roleId");
        Integer meetingRemindingTime = Integer.valueOf(request.getParameter("meetingRemindingTime"));
        String jobTitle = request.getParameter("jobTitle");
        String phoneNumber = request.getParameter("phoneNumber");
        String phoneNumberSpare = request.getParameter("phoneNumberSpare");
        Integer rank = Integer.valueOf(request.getParameter("rank"));
        String community = request.getParameter("community");
        String enable = request.getParameter("enable");
        String hide = request.getParameter("hide");
        String departmentId = request.getParameter("departmentId");
        String code = request.getParameter("code");
        String id = request.getParameter("hm_user_id");
        
        if(request.getMethod().equals("GET")){
            HmUser user = hmUserService.get(id);

            return user;
        } else if(request.getMethod().equals("PUT")){
            HmUser user = hmUserService.get(id);

            if( username != null ){
                user.setUsername(username);
            }
            if( loginid != null ){
                user.setLoginid(loginid);
            }
            if( password != null ){
                user.setPassword(password);
            }
            if( mobile != null ){
                user.setMobile(mobile);
            }
            if( email != null ){
                user.setEmail(email);
            }
            if( avatar != null ){
                user.setAvatar(avatar);
            }
            user.setLastUpdateTime(new Date());
            if( lastLoginTime != null ){
                user.setLastLoginTime(Tools.convertStringToDate(lastLoginTime, "yyyy-MM-dd HH:mm:ss"));
            }
            if( departmentCode != null ){
                user.setDepartmentCode(departmentCode);
            }
            if( roleId != null ){
                user.setRoleId(roleId);
            }
            if( meetingRemindingTime != null ){
                user.setMeetingRemindingTime(meetingRemindingTime);
            }
            if( jobTitle != null ){
                user.setJobTitle(jobTitle);
            }
            if( phoneNumber != null ){
                user.setPhoneNumber(phoneNumber);
            }
            if( phoneNumberSpare != null ){
                user.setPhoneNumberSpare(phoneNumberSpare);
            }
            if( rank != null ){
                user.setRank(rank);
            }
            if( community != null ){
                user.setCommunity(community);
            }
            if( enable != null ){
                user.setEnable(enable);
            }
            if( hide != null ){
                user.setHide(hide);
            }
            if( departmentId != null ){
                user.setDepartmentId(departmentId);
            }
            if( code != null ){
                user.setCode(code);
            }
            hmUserService.update(user);

            return hmUserService.get(id);
        }
        return null;
    }
    
}
