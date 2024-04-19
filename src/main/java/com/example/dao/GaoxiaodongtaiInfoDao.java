package com.example.dao;

import com.example.entity.GaoxiaodongtaiInfo;
import com.example.vo.GaoxiaodongtaiInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface GaoxiaodongtaiInfoDao extends Mapper<GaoxiaodongtaiInfo> {
    List<GaoxiaodongtaiInfoVo> findByJilushijian(@Param("jilushijian") String jilushijian);

    int checkRepeat(@Param("column") String column, @Param("value") String value, @Param("id") Long id);

    Integer count();

    @Select("select * from gaoxiaodongtai_info where xuexiaomingcheng = #{xuexiaomingcheng}")
    GaoxiaodongtaiInfo selectByXuexiaomingcheng(String xuexiaomingcheng);

    @Select("SELECT * FROM gaoxiaodongtai_info order by id")
    List<Map<String, Object>> daochuexcel();


}
