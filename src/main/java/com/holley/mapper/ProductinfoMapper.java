package com.holley.mapper;

import com.holley.model.Productinfo;
import com.holley.model.ProductinfoExample;
import com.holley.model.ProductinfoWithBLOBs;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductinfoMapper {
    int countByExample(ProductinfoExample example);

    int deleteByExample(ProductinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductinfoWithBLOBs record);

    int insertSelective(ProductinfoWithBLOBs record);

    List<ProductinfoWithBLOBs> selectByExampleWithBLOBs(ProductinfoExample example);

    List<Productinfo> selectByExample(ProductinfoExample example);

    ProductinfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductinfoWithBLOBs record, @Param("example") ProductinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") ProductinfoWithBLOBs record, @Param("example") ProductinfoExample example);

    int updateByExample(@Param("record") Productinfo record, @Param("example") ProductinfoExample example);

    int updateByPrimaryKeySelective(ProductinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProductinfoWithBLOBs record);

    int updateByPrimaryKey(Productinfo record);
}