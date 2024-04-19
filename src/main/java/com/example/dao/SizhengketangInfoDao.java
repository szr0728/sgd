package com.example.dao;

import com.example.entity.SizhengketangInfo;
import com.example.vo.SizhengketangInfoVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface SizhengketangInfoDao extends Mapper<SizhengketangInfo> {
    List<SizhengketangInfoVo> findByKechengbianhao(@Param("kechengbianhao") String kechengbianhao);

    List<SizhengketangInfoVo> findByKechengbianhaolb(@Param("kechengbianhao") String kechengbianhao, @Param("leixing") String leixing);

    int checkRepeat(@Param("column") String column, @Param("value") String value, @Param("id") Long id);

    Integer count();

    @Select("select * from sizhengketang_info where kechengmingcheng = #{kechengmingcheng}")
    SizhengketangInfo selectByKechengmingcheng(String kechengmingcheng);

    @Select("SELECT * FROM sizhengketang_info order by id")
    List<Map<String, Object>> daochuexcel();


}
