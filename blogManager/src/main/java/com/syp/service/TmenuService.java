package com.syp.service;

import java.util.HashMap;
import java.util.List;

import com.syp.entity.Tmenu;

public interface TmenuService extends IService<Tmenu>{

    List<Tmenu> selectMenusByRoleId(Integer roleid);

    List<Tmenu> selectByParentIdAndRoleId(HashMap<String, Object> paraMap);


}