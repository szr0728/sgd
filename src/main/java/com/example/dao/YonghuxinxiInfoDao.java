package com.example.dao;

import com.example.entity.YonghuxinxiInfo;
import com.example.vo.YonghuxinxiInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface YonghuxinxiInfoDao extends Mapper<YonghuxinxiInfo> {
    List<YonghuxinxiInfoVo> findByXingming(@Param("xingming") String xingming);

    int checkRepeat(@Param("column") String column, @Param("value") String value, @Param("id") Long id);

    Integer count();

    @Select("select * from yonghuxinxi_info where yonghuming = #{yonghuming}")
    YonghuxinxiInfo selectByYonghuming(String yonghuming);

    @Select("SELECT * FROM yonghuxinxi_info order by id")
    List<Map<String, Object>> daochuexcel();


    YonghuxinxiInfoVo findByYonghumingzj(String yonghuming);

}
