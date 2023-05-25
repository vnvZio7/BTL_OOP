package com.QLBH.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "KHACHHANG")
public class CustomerEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MAKH")
	private String maKH;
	@Column(name = "HOTEN")
	private String hoten;
	@Column(name = "DCHI")
	private String diachi;
	@Column(name = "SODT")
	private String sdt;
	@Column(name = "NGSINH")
	private Date ngSinh;
	@Column(name = "NGDK")
	private Date ngDK;
	@Column(name = "DOANHSO")
	private double doanhso;
	@JsonIgnore
	@OneToMany(mappedBy = "customerEntity", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderEntity> orders = new ArrayList<>();
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public Date getNgSinh() {
		return ngSinh;
	}
	public void setNgSinh(Date ngSinh) {
		this.ngSinh = ngSinh;
	}
	public Date getNgDK() {
		return ngDK;
	}
	public void setNgDK(Date ngDK) {
		this.ngDK = ngDK;
	}
	public double getDoanhso() {
		return doanhso;
	}
	public void setDoanhso(double doanhso) {
		this.doanhso = doanhso;
	}
	public List<OrderEntity> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}
	public CustomerEntity(String maKH, String hoten, String diachi, String sdt, Date ngSinh, Date ngDK, double doanhso,
			List<OrderEntity> orders) {
		super();
		this.maKH = maKH;
		this.hoten = hoten;
		this.diachi = diachi;
		this.sdt = sdt;
		this.ngSinh = ngSinh;
		this.ngDK = ngDK;
		this.doanhso = doanhso;
		this.orders = orders;
	}
	public CustomerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
