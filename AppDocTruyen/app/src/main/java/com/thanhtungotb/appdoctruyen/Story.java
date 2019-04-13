package com.thanhtungotb.appdoctruyen;


import java.io.Serializable;

public class Story implements Serializable {
    private String tentruyen;
    private String tentacgia;
    private String noidung;
    private String ngaycapnhap;
    private String theloai;
    private String trangthai;
    private String sochuong;
    private String ngayup;
    private int photo;

    public Story() {

    }

    public Story(String tentruyen, String tentacgia, String noidung, String ngaycapnhap, String theloai, String trangthai, String sochuong, String ngayup, int photo) {
        this.tentruyen = tentruyen;
        this.tentacgia = tentacgia;
        this.noidung = noidung;
        this.ngaycapnhap = ngaycapnhap;
        this.theloai = theloai;
        this.trangthai = trangthai;
        this.sochuong = sochuong;
        this.ngayup = ngayup;
        this.photo = photo;
    }

    public void setSochuong(String sochuong) {
        this.sochuong = sochuong;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getTentruyen() {
        return tentruyen;
    }

    public void setTentruyen(String tentruyen) {
        this.tentruyen = tentruyen;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    public String getNgaycapnhap() {
        return ngaycapnhap;
    }

    public void setNgaycapnhap(String ngaycapnhap) {
        this.ngaycapnhap = ngaycapnhap;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getSochuong() {
        return sochuong;
    }

    public String getNgayup() {
        return ngayup;
    }

    public void setNgayup(String ngayup) {
        this.ngayup = ngayup;
    }
}
