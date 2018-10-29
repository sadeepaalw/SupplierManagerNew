package com.supplier.manage.services;

import java.util.List;

import com.supplier.manage.model.Supplier;

public interface SupplierService {

	Supplier saveSupplier(Supplier supplier);
	Supplier updateSupplier(Supplier supplier);
	void deleteSupplier(Supplier supplier);
	List<Supplier> getAllSuppliers();
}
