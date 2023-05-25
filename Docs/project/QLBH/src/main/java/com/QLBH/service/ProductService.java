package com.QLBH.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QLBH.converter.ProductConverter;
import com.QLBH.dto.ProductDTO;
import com.QLBH.entity.OrderDetailEntity;
import com.QLBH.entity.OrderEntity;
import com.QLBH.entity.ProductEntity;
import com.QLBH.repositories.OrderDetailRepository;
import com.QLBH.repositories.OrderRepository;
import com.QLBH.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private OrderDetailRepository orderDetailRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ProductConverter productConverter;
	public List<ProductEntity> listAll(){
		return productRepository.findAll();
	}

	public ProductDTO save(ProductDTO productDTO) {

		ProductEntity productEntity = productConverter.toEntity(productDTO);
		productEntity = productRepository.save(productEntity);
		return productConverter.toDTO(productEntity);
	}
	public void deleteByMaSP(String maSP) {
		List<ProductEntity> entitys = productRepository.findAll();
		for(ProductEntity entity : entitys) {
			if(entity.getMaSP().equals(maSP)) {
				productRepository.delete(entity);
			}
		}
	}
	public void delete(String maSP) {
		deleteByMaSP(maSP);
//		productRepository.deleteByMaSP(maSP);
	}
	

	public ProductDTO findByMaSP(String maSP){
		List<ProductEntity> entitys = productRepository.findAll();
		for(ProductEntity entity : entitys) {
			if(entity.getMaSP().equals(maSP)) {
				return productConverter.toDTO(entity);
			}
		}
		return null;
	}
}
	


