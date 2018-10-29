package com.supplier.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supplier.manage.model.Supplier;

public interface SupplierRepo extends JpaRepository<Supplier, Integer>{

}
