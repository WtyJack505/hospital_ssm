package com.hospital.mapper;

import com.hospital.entity.RoleMenuRelation;
import com.hospital.entity.RoleMenuRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuRelationMapper {
    long countByExample(RoleMenuRelationExample example);

    int deleteByExample(RoleMenuRelationExample example);

    int insert(RoleMenuRelation record);

    int insertSelective(RoleMenuRelation record);

    List<RoleMenuRelation> selectByExample(RoleMenuRelationExample example);

    int updateByExampleSelective(@Param("record") RoleMenuRelation record, @Param("example") RoleMenuRelationExample example);

    int updateByExample(@Param("record") RoleMenuRelation record, @Param("example") RoleMenuRelationExample example);
}