package com.example.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.dao.SizhengketangInfoDao;
//kuabiaojisuan1
import com.example.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.entity.SizhengketangInfo;
//kuabiaojisuan2
import com.example.exception.CustomException;
import com.example.common.ResultCode;
import com.example.vo.SizhengketangInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.crypto.SecureUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class SizhengketangInfoService {

    @Resource
    private SizhengketangInfoDao sizhengketangInfoDao;

    //kuabiaojisuan3

    public SizhengketangInfo add(SizhengketangInfo sizhengketangInfo) {
        //shangxchxuantupxian
        // 唯一校验
        int count = sizhengketangInfoDao.checkRepeat("kechengbianhao", sizhengketangInfo.getKechengbianhao(), null);
        if (count > 0) {
            throw new CustomException("1001", "该课程编号\"" + sizhengketangInfo.getKechengbianhao() + "\"已存在");
        }
        // sizhengketangInfo.setAccount((double) 0);

        sizhengketangInfoDao.insertSelective(sizhengketangInfo);
        return sizhengketangInfo;
    }

    public void delete(Long id) {
        sizhengketangInfoDao.deleteByPrimaryKey(id);
    }

    public void update(SizhengketangInfo sizhengketangInfo) {
        //shangxchxuantupxian
        //youdianzan
        sizhengketangInfoDao.updateByPrimaryKeySelective(sizhengketangInfo);
    }

    public SizhengketangInfo findById(Long id) {
        return sizhengketangInfoDao.selectByPrimaryKey(id);
    }

    public List<SizhengketangInfoVo> findAll() {
        return sizhengketangInfoDao.findByKechengbianhao("all");
    }

    public PageInfo<SizhengketangInfoVo> findPage(String kechengbianhao, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);

        List<SizhengketangInfoVo> all = null;
        Account user = (Account) request.getSession().getAttribute("user");
        if (user.getLevel().equals("管理员")) {
            all = sizhengketangInfoDao.findByKechengbianhao(kechengbianhao);
        }


        return PageInfo.of(all);
    }

    public PageInfo<SizhengketangInfoVo> findPageqt(String kechengbianhao, String leixing, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);

        List<SizhengketangInfoVo> all = null;
        Account user = (Account) request.getSession().getAttribute("user");
        all = sizhengketangInfoDao.findByKechengbianhaolb(kechengbianhao, leixing);


        return PageInfo.of(all);
    }

    // public SizhengketangInfoVo findByUserName(String name) {
//        return sizhengketangInfoDao.findByUsername(name);
//    }

    //yoxulogindenxglu

    public void changeStatus(Long id) {
        SizhengketangInfo sizhengketangInfo = sizhengketangInfoDao.selectByPrimaryKey(id);
        if (sizhengketangInfo.getStatus().equals("是")) {
            sizhengketangInfo.setStatus("否");
            sizhengketangInfoDao.updateByPrimaryKey(sizhengketangInfo);
        } else if (sizhengketangInfo.getStatus().equals("否")) {
            sizhengketangInfo.setStatus("是");
            sizhengketangInfoDao.updateByPrimaryKey(sizhengketangInfo);
        }
    }
    //ddaizdhifu
    //youtixing


}
