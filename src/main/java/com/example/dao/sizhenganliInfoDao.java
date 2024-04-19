package com.example.dao;

import com.example.entity.sizhenganliInfo;
import com.example.vo.sizhenganliInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface sizhenganliInfoDao extends Mapper<sizhenganliInfo> {
    List<sizhenganliInfoVo> findByBiaoti(@Param("biaoti") String biaoti);

    List<sizhenganliInfoVo> findByBiaotilb(@Param("biaoti") String biaoti, @Param("leibie") String leibie);

    List<sizhenganliInfoVo> findByBiaotilist2(@Param("biaoti") String biaoti, @Param("faburen") String faburen);

    int checkRepeat(@Param("column") String column, @Param("value") String value, @Param("id") Long id);

    Integer count();

    @Select("select * from sizhenganli_info where faburen = #{faburen} and shengpi = true")
    sizhenganliInfo selectByFaburen(String faburen);

//    @Select("SELECT distinct(leibie) as aa,count(id) as bb FROM sizhenganli_info where shengpi = 1 group by leibie order by id")
    @Select("SELECT distinct(leibie) as aa,count(id) as bb FROM sizhenganli_info where shengpi = true group by leibie order by id")
    List<Map<String, Object>> sizhenganli_tj_leibie();


}
