package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "gaoxiaodongtai_info")
public class GaoxiaodongtaiInfo extends Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tupian")
    private String tupian;
    @Column(name = "xuexiaomingcheng")
    private String xuexiaomingcheng;
    @Column(name = "jilushijian")
    private String jilushijian;
    @Column(name = "jinqidongtai")
    private String jinqidongtai;

    @Column(name = "addtime")
    private String addtime;
    @Column(name = "status")
    private String status;
    @Transient
    private List<Long> tupianflst;    //yoxuxtupTransiexnt

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Long> getTupianflst() {
        return tupianflst;
    }

    public void setTupianflst(List<Long> tupianflst) {
        this.tupianflst = tupianflst;
    }

    //public String getFileIds() {
//		return fileIds;
//	}
//
//	public void setFileIds(String fileIds) {
//		this.fileIds = fileIds;
//	}


    public String getTupian() {
        return tupian;
    }

    public void setTupian(String tupian) {
        this.tupian = tupian;
    }

    public String getXuexiaomingcheng() {
        return xuexiaomingcheng;
    }

    public void setXuexiaomingcheng(String xuexiaomingcheng) {
        this.xuexiaomingcheng = xuexiaomingcheng;
    }

    public String getJilushijian() {
        return jilushijian;
    }

    public void setJilushijian(String jilushijian) {
        this.jilushijian = jilushijian;
    }

    public String getJinqidongtai() {
        return jinqidongtai;
    }

    public void setJinqidongtai(String jinqidongtai) {
        this.jinqidongtai = jinqidongtai;
    }


    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}