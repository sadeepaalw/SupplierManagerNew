package com.supplier.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.supplier.manage.services.MaterialService;
import com.supplier.manage.services.SupplierService;

@RestController
public class SupplierManagerController {

	@Autowired MaterialService materialservice;
	@Autowired SupplierService supplierservice;
	
	@RequestMapping("/getSupplier")
	public void getSuppliers() {
		
	}
}
