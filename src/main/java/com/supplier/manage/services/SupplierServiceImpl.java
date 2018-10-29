package com.supplier.manage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.supplier.manage.model.Supplier;
import com.supplier.manage.repository.SupplierRepo;

public class SupplierServiceImpl implements SupplierService{

	@Autowired
	SupplierRepo supplierrepo;
	
	public SupplierRepo getSupplierrepo() {
		return supplierrepo;
	}

	public void setSupplierrepo(SupplierRepo supplierrepo) {
		this.supplierrepo = supplierrepo;
	}

	@Override
	public Supplier saveSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierrepo.save(supplier);		
	}

	@Override
	public Supplier updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierrepo.save(supplier);
	}

	@Override
	public void deleteSupplier(Supplier supplier) {
		supplierrepo.delete(supplier);
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		// TODO Auto-generated method stub
		return supplierrepo.findAll();
	}

}
