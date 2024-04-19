package com.example.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.dao.GaoxiaodongtaiInfoDao;
//kuabiaojisuan1
import com.example.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.entity.GaoxiaodongtaiInfo;
//kuabiaojisuan2
import com.example.exception.CustomException;
import com.example.common.ResultCode;
import com.example.vo.GaoxiaodongtaiInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.crypto.SecureUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class GaoxiaodongtaiInfoService {

    @Resource
    private GaoxiaodongtaiInfoDao gaoxiaodongtaiInfoDao;

    //kuabiaojisuan3

    public GaoxiaodongtaiInfo add(GaoxiaodongtaiInfo gaoxiaodongtaiInfo) {
        List<Long> tupianflst = gaoxiaodongtaiInfo.getTupianflst();
        if (!CollectionUtil.isEmpty(tupianflst)) {
            gaoxiaodongtaiInfo.setTupian(tupianflst.toString());
        }

        //shangxchxuantupxian
        // 唯一校验

        // gaoxiaodongtaiInfo.setAccount((double) 0);

        gaoxiaodongtaiInfoDao.insertSelective(gaoxiaodongtaiInfo);
        return gaoxiaodongtaiInfo;
    }

    public void delete(Long id) {
        gaoxiaodongtaiInfoDao.deleteByPrimaryKey(id);
    }

    public void update(GaoxiaodongtaiInfo gaoxiaodongtaiInfo) {
        List<Long> tupianflst = gaoxiaodongtaiInfo.getTupianflst();
        if (!CollectionUtil.isEmpty(tupianflst)) {
            gaoxiaodongtaiInfo.setTupian(tupianflst.toString());
        }

        //shangxchxuantupxian
        //youdianzan
        gaoxiaodongtaiInfoDao.updateByPrimaryKeySelective(gaoxiaodongtaiInfo);
    }

    public GaoxiaodongtaiInfo findById(Long id) {
        return gaoxiaodongtaiInfoDao.selectByPrimaryKey(id);
    }

    public List<GaoxiaodongtaiInfoVo> findAll() {
        return gaoxiaodongtaiInfoDao.findByJilushijian("all");
    }

    public PageInfo<GaoxiaodongtaiInfoVo> findPage(String jilushijian, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);

        List<GaoxiaodongtaiInfoVo> all = null;
        Account user = (Account) request.getSession().getAttribute("user");
        if (user.getLevel().equals("管理员")) {
            all = gaoxiaodongtaiInfoDao.findByJilushijian(jilushijian);
        }


        return PageInfo.of(all);
    }

    public PageInfo<GaoxiaodongtaiInfoVo> findPageqt(String jilushijian, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);

        List<GaoxiaodongtaiInfoVo> all = null;
        Account user = (Account) request.getSession().getAttribute("user");
        all = gaoxiaodongtaiInfoDao.findByJilushijian(jilushijian);


        return PageInfo.of(all);
    }

    // public GaoxiaodongtaiInfoVo findByUserName(String name) {
//        return gaoxiaodongtaiInfoDao.findByUsername(name);
//    }

    //yoxulogindenxglu

    public void changeStatus(Long id) {
        GaoxiaodongtaiInfo gaoxiaodongtaiInfo = gaoxiaodongtaiInfoDao.selectByPrimaryKey(id);
        if (gaoxiaodongtaiInfo.getStatus().equals("是")) {
            gaoxiaodongtaiInfo.setStatus("否");
            gaoxiaodongtaiInfoDao.updateByPrimaryKey(gaoxiaodongtaiInfo);
        } else if (gaoxiaodongtaiInfo.getStatus().equals("否")) {
            gaoxiaodongtaiInfo.setStatus("是");
            gaoxiaodongtaiInfoDao.updateByPrimaryKey(gaoxiaodongtaiInfo);
        }
    }
    //ddaizdhifu
    //youtixing


}
