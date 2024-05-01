package com.example.service;

import cn.hutool.core.collection.CollectionUtil;
import com.example.dao.sizhenganliInfoDao;
//kuabiaojisuan1
import com.example.entity.*;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.example.entity.sizhenganliInfo;
//kuabiaojisuan2
import com.example.exception.CustomException;
import com.example.common.ResultCode;
import com.example.vo.sizhenganliInfoVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.hutool.crypto.SecureUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Service
public class sizhenganliInfoService {

    @Resource
    private sizhenganliInfoDao sizhenganliInfoDao;

    //kuabiaojisuan3

    public sizhenganliInfo add(sizhenganliInfo sizhenganliInfo) {
        List<Long> shouyetupianflst = sizhenganliInfo.getShouyetupianflst();
        if (!CollectionUtil.isEmpty(shouyetupianflst)) {
            sizhenganliInfo.setShouyetupian(shouyetupianflst.toString());
        }

        //shangxchxuantupxian
        // 唯一校验

        // sizhenganliInfo.setAccount((double) 0);

        sizhenganliInfoDao.insertSelective(sizhenganliInfo);
        return sizhenganliInfo;
    }

    public void delete(Long id) {
        sizhenganliInfoDao.deleteByPrimaryKey(id);
    }

    public void update(sizhenganliInfo sizhenganliInfo) {
        List<Long> shouyetupianflst = sizhenganliInfo.getShouyetupianflst();
        if (!CollectionUtil.isEmpty(shouyetupianflst)) {
            sizhenganliInfo.setShouyetupian(shouyetupianflst.toString());
        }

        //shangxchxuantupxian
        if (sizhenganliInfo.getDianzan_d() != null) {
            sizhenganliInfo sizhenganli = findById(sizhenganliInfo.getId());
            sizhenganliInfo.setDianzan_d(String.valueOf(Integer.valueOf(sizhenganli.getDianzan_d()) + Integer.valueOf(sizhenganliInfo.getDianzan_d())));
        }
        if (sizhenganliInfo.getDianzan_c() != null) {
            sizhenganliInfo sizhenganli = findById(sizhenganliInfo.getId());
            sizhenganliInfo.setDianzan_c(String.valueOf(Integer.valueOf(sizhenganli.getDianzan_c()) + Integer.valueOf(sizhenganliInfo.getDianzan_c())));
        }
        if (sizhenganliInfo.getDianjilv() != null) {
            sizhenganliInfo sizhenganli = findById(sizhenganliInfo.getId());
            sizhenganliInfo.setDianjilv(String.valueOf(Integer.valueOf(sizhenganli.getDianjilv()) + 1));
        }
        sizhenganliInfoDao.updateByPrimaryKeySelective(sizhenganliInfo);
    }

    public sizhenganliInfo findById(Long id) {
        return sizhenganliInfoDao.selectByPrimaryKey(id);
    }

    public List<sizhenganliInfoVo> findAll() {
        return sizhenganliInfoDao.findByBiaoti("all");
    }

    public PageInfo<sizhenganliInfoVo> findPage(String biaoti, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);

        List<sizhenganliInfoVo> all = null;
        Account user = (Account) request.getSession().getAttribute("user");
        if (user.getLevel().equals("管理员")) {
            all = sizhenganliInfoDao.findByBiaoti(biaoti);
        }
        System.out.println(user.getLevel());
        if (user.getLevel().equals("用户")) {
            all = sizhenganliInfoDao.findByBiaoti(biaoti);

        }
        //list3 if (user.getLevel().equals("cxcxx3")) {all = sizhenganliInfoDao.findByBiaotilist3(biaoti,user.getdxzhujian3()); }


        return PageInfo.of(all);
    }
    public PageInfo<sizhenganliInfoVo> findPageqt(String biaoti, String leibie, Integer pageNum, Integer pageSize, HttpServletRequest request) {
        PageHelper.startPage(pageNum, pageSize);

        List<sizhenganliInfoVo> all = null;
        Account user = (Account) request.getSession().getAttribute("user");
        all = sizhenganliInfoDao.findByBiaotilb(biaoti, leibie);
        //list2 if (user.getLevel().equals("cxcxx2")) {all = sizhenganliInfoDao.findByBiaotilist2(biaoti,user.getdxzhujian2()); }
        //list3 if (user.getLevel().equals("cxcxx3")) {all = sizhenganliInfoDao.findByBiaotilist3(biaoti,user.getdxzhujian3()); }


        return PageInfo.of(all);
    }

    // public sizhenganliInfoVo findByUserName(String name) {
//        return sizhenganliInfoDao.findByUsername(name);
//    }

    //yoxulogindenxglu

//    public void changeStatus(Long id) {
//        sizhenganliInfo sizhenganliInfo = sizhenganliInfoDao.selectByPrimaryKey(id);
//        if (sizhenganliInfo.getStatus().equals("是")) {
//            sizhenganliInfo.setStatus("否");
//            sizhenganliInfoDao.updateByPrimaryKey(sizhenganliInfo);
//        } else if (sizhenganliInfo.getStatus().equals("否")) {
//            sizhenganliInfo.setStatus("是");
//            sizhenganliInfoDao.updateByPrimaryKey(sizhenganliInfo);
//        }
//    }

    public void changeStatus(Long id) {
        sizhenganliInfo sizhenganliInfo = sizhenganliInfoDao.selectByPrimaryKey(id);
        if (sizhenganliInfo.getShengpi().equals("未通过")) {
            sizhenganliInfo.setShengpi("通过");
            sizhenganliInfoDao.updateByPrimaryKey(sizhenganliInfo);
        } else if (sizhenganliInfo.getShengpi().equals("通过")) {
            sizhenganliInfo.setShengpi("未通过");
            sizhenganliInfoDao.updateByPrimaryKey(sizhenganliInfo);
        }
    }
    //youtixing
    public void approve(Long id) {
        sizhenganliInfo info = findById(id);
        if (info != null) {
            info.setShengpi("通过");
            update(info);
        } else {
//            throw new CustomException(ResultCode.DATA_NOT_FOUND);
        }
    }

    /**
     * 通过ID更改思政案例审批状态为不通过
     */
    public void reject(Long id) {
        sizhenganliInfo info = findById(id);
        if (info != null) {
            info.setShengpi("不通过");
            update(info);
        } else {
//            throw new CustomException(ResultCode.DATA_NOT_FOUND);
        }
    }

}
