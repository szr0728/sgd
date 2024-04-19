package com.example.entity;

import javax.persistence.*;
import java.util.List;

@Table(name = "xitongjianjie_info")
public class XitongjianjieInfo extends Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "leibie")
    private String leibie;
    @Column(name = "neirong")
    private String neirong;

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


    public String getLeibie() {
        return leibie;
    }

    public void setLeibie(String leibie) {
        this.leibie = leibie;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
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