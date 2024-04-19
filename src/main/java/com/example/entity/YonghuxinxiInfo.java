package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "yonghuxinxi_info")
public class YonghuxinxiInfo extends Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "yonghuming")
    private String yonghuming;
    @Column(name = "mima")
    private String mima;
    @Column(name = "xingming")
    private String xingming;
    @Column(name = "xingbie")
    private String xingbie;
    @Column(name = "chushengriqi")
    private String chushengriqi;
    @Column(name = "shouji")
    private String shouji;
    @Column(name = "shenfenzheng")
    private String shenfenzheng;
    @Column(name = "touxiang")
    private String touxiang;
    @Column(name = "level")
    private String level;

    @Column(name = "addtime")
    private String addtime;
    @Column(name = "status")
    private String status;
    @Transient
    private List<Long> touxiangflst;    //yoxuxtupTransiexnt

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Long> getTouxiangflst() {
        return touxiangflst;
    }

    public void setTouxiangflst(List<Long> touxiangflst) {
        this.touxiangflst = touxiangflst;
    }

    //public String getFileIds() {
//		return fileIds;
//	}
//
//	public void setFileIds(String fileIds) {
//		this.fileIds = fileIds;
//	}


    public String getYonghuming() {
        return yonghuming;
    }

    public void setYonghuming(String yonghuming) {
        this.yonghuming = yonghuming;
    }

    public String getMima() {
        return mima;
    }

    public void setMima(String mima) {
        this.mima = mima;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public String getChushengriqi() {
        return chushengriqi;
    }

    public void setChushengriqi(String chushengriqi) {
        this.chushengriqi = chushengriqi;
    }

    public String getShouji() {
        return shouji;
    }

    public void setShouji(String shouji) {
        this.shouji = shouji;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public String getTouxiang() {
        return touxiang;
    }

    public void setTouxiang(String touxiang) {
        this.touxiang = touxiang;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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