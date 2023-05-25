package com.QLBH.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "HOADON")
public class OrderEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "SOHD")
	private int soHD;
	
	@Column(name = "NGHD")
	private Date ngHD;
	
	@Column(name = "TRIGIA")
	private double trigia;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MAKH")
    private CustomerEntity customerEntity;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANV")
    private EmployeeEntity employeeEntity;

	public int getSoHD() {
		return soHD;
	}

	public void setSoHD(int soHD) {
		this.soHD = soHD;
	}

	public Date getNgHD() {
		return ngHD;
	}

	public void setNgHD(Date ngHD) {
		this.ngHD = ngHD;
	}

	public double getTrigia() {
		return trigia;
	}

	public void setTrigia(double trigia) {
		this.trigia = trigia;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	public EmployeeEntity getEmployeeEntity() {
		return employeeEntity;
	}

	public void setEmployeeEntity(EmployeeEntity employeeEntity) {
		this.employeeEntity = employeeEntity;
	}

	public OrderEntity(int soHD, Date ngHD, double trigia, CustomerEntity customerEntity,
			EmployeeEntity employeeEntity) {
		super();
		this.soHD = soHD;
		this.ngHD = ngHD;
		this.trigia = trigia;
		this.customerEntity = customerEntity;
		this.employeeEntity = employeeEntity;
	}

	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
