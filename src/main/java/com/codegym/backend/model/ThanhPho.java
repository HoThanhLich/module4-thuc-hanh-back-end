package com.codegym.backend.model;

import javax.persistence.*;

@Entity
public class ThanhPho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ten;
    private double dienTich;
    private Long danSo;
    private double GDP;
    private String moTa;
    @ManyToOne
    private QuocGia quocGia;

    public ThanhPho() {
    }

    public ThanhPho(String ten, double dienTich, Long danSo, double GDP, String moTa, QuocGia quocGia) {
        this.ten = ten;
        this.dienTich = dienTich;
        this.danSo = danSo;
        this.GDP = GDP;
        this.moTa = moTa;
        this.quocGia = quocGia;
    }

    public ThanhPho(Long id, String ten, double dienTich, Long danSo, double GDP, String moTa, QuocGia quocGia) {
        this.id = id;
        this.ten = ten;
        this.dienTich = dienTich;
        this.danSo = danSo;
        this.GDP = GDP;
        this.moTa = moTa;
        this.quocGia = quocGia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public Long getDanSo() {
        return danSo;
    }

    public void setDanSo(Long danSo) {
        this.danSo = danSo;
    }

    public double getGDP() {
        return GDP;
    }

    public void setGDP(double GDP) {
        this.GDP = GDP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public QuocGia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(QuocGia quocGia) {
        this.quocGia = quocGia;
    }
}
