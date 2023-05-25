package com.QLBH.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.QLBH.dto.ProductDTO;
import com.QLBH.entity.ProductEntity;
import com.QLBH.service.ProductService;
import com.QLBH.service.UserService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private UserService userService;

	@GetMapping("/index.html")
	public String list(Model model) {
		model.addAttribute("products", productService.listAll());
		return "index";
	}

	@GetMapping("/BanHang.html")
	public String BanHang() {
		return "BanHang";
	}

	@GetMapping("/quanlySP.html")
	public String QLSP() {
		return "quanlySP";
	}

	@GetMapping("/NhomNhanVien.html")
	public String NNV() {
		return "NhomNhanVien";
	}

	@GetMapping("/delete/{maSP}")
	public String delete(@PathVariable String maSP, Model model) {
		productService.delete(maSP);
		model.addAttribute("products", productService.listAll());
		return "redirect:/index.html";
	}

}
