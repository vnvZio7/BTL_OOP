package com.QLBH.dto;

import java.util.List;

public class ProductDTO {
	private String maSP;
	private String tenSP;
	private String dvt;
	private String nuocSX;
	
	private double gia;
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getDvt() {
		return dvt;
	}
	public void setDvt(String dvt) {
		this.dvt = dvt;
	}
	public String getNuocSX() {
		return nuocSX;
	}
	public void setNuocSX(String nuocSX) {
		this.nuocSX = nuocSX;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public ProductDTO(String maSP, String tenSP, String dvt, String nuocSX, double gia) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.dvt = dvt;
		this.nuocSX = nuocSX;
		this.gia = gia;
	}
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
