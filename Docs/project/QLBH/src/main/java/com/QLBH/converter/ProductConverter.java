package com.QLBH.converter;

import org.springframework.stereotype.Component;

import com.QLBH.dto.ProductDTO;
import com.QLBH.entity.ProductEntity;

@Component

public class ProductConverter {
	public ProductEntity toEntity(ProductDTO dto) {
        ProductEntity entity = new ProductEntity();
        entity.setMaSP(dto.getMaSP());
        entity.setTenSP(dto.getTenSP());
        entity.setDvt(dto.getDvt());
        entity.setNuocSX(dto.getNuocSX());
         entity.setGia(dto.getGia());
        return entity;
    }

    public ProductDTO toDTO(ProductEntity entity) {
        ProductDTO dto = new ProductDTO();
        dto.setMaSP(entity.getMaSP());
        dto.setTenSP(entity.getTenSP());
        dto.setDvt(entity.getDvt());
        dto.setNuocSX(entity.getNuocSX());
         dto.setGia(entity.getGia());
        return dto;
    }
    public ProductEntity toEntity(ProductDTO dto,ProductEntity entity) {
        entity.setMaSP(dto.getMaSP());
        entity.setTenSP(dto.getTenSP());
        entity.setDvt(dto.getDvt());
        entity.setNuocSX(dto.getNuocSX());
         entity.setGia(dto.getGia());
        return entity;
    }
}
