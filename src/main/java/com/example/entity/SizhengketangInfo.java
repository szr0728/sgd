package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "sizhengketang_info")
public class SizhengketangInfo extends Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "kechengbianhao")
    private String kechengbianhao;
    @Column(name = "kechengmingcheng")
    private String kechengmingcheng;
    @Column(name = "leixing")
    private String leixing;
    @Column(name = "kechengshipinID")
    private String kechengshipinID;
    @Column(name = "kechengshipinNm")
    private String kechengshipinNm;
    @Column(name = "kechengjianjie")
    private String kechengjianjie;

    @Column(name = "addtime")
    private String addtime;
    @Column(name = "status")
    private String status;

    //yoxuxtupTransiexnt
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //gextsexttpzidxuan

    //public String getFileIds() {
//		return fileIds;
//	}
//
//	public void setFileIds(String fileIds) {
//		this.fileIds = fileIds;
//	}


    public String getKechengbianhao() {
        return kechengbianhao;
    }

    public void setKechengbianhao(String kechengbianhao) {
        this.kechengbianhao = kechengbianhao;
    }

    public String getKechengmingcheng() {
        return kechengmingcheng;
    }

    public void setKechengmingcheng(String kechengmingcheng) {
        this.kechengmingcheng = kechengmingcheng;
    }

    public String getLeixing() {
        return leixing;
    }

    public void setLeixing(String leixing) {
        this.leixing = leixing;
    }

    public String getKechengshipinID() {
        return kechengshipinID;
    }

    public void setKechengshipinID(String kechengshipinID) {
        this.kechengshipinID = kechengshipinID;
    }

    public String getKechengshipinNm() {
        return kechengshipinNm;
    }

    public void setKechengshipinNm(String kechengshipinNm) {
        this.kechengshipinNm = kechengshipinNm;
    }

    public String getKechengjianjie() {
        return kechengjianjie;
    }

    public void setKechengjianjie(String kechengjianjie) {
        this.kechengjianjie = kechengjianjie;
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