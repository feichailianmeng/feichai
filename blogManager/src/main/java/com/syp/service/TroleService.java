package com.syp.service;

import java.util.List;

import com.syp.entity.Trole;

public interface TroleService extends IService<Trole>{


    //↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    List<Trole> selectRolesByUserId(Integer userid);//根据userid查询所有的角色

}