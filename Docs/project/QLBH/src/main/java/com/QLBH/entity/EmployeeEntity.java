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
@Table(name = "NHANVIEN")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MANV")
	private String maNV;
	@Column(name = "HOTEN")
	private String hoten;
	@Column(name = "SODT")
	private String sdt;
	@Column(name = "NGVL")
	private Date ngVL;
	@JsonIgnore
	@OneToMany(mappedBy = "employeeEntity", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<OrderEntity> orders = new ArrayList<>();
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public Date getNgVL() {
		return ngVL;
	}
	public void setNgVL(Date ngVL) {
		this.ngVL = ngVL;
	}
	public List<OrderEntity> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderEntity> orders) {
		this.orders = orders;
	}
	public EmployeeEntity(String maNV, String hoten, String sdt, Date ngVL, List<OrderEntity> orders) {
		super();
		this.maNV = maNV;
		this.hoten = hoten;
		this.sdt = sdt;
		this.ngVL = ngVL;
		this.orders = orders;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
