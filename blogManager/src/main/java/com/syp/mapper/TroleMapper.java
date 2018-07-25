package com.syp.mapper;

import com.syp.entity.Trole;
import com.syp.util.MyMapper;

import java.util.List;

public interface TroleMapper extends MyMapper<Trole> {

    List<Trole> selectRolesByUserId(Integer userid);

}