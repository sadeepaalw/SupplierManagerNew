package com.supplier.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.supplier.manage.model.Materials;

public interface MaterialRepo extends JpaRepository<Materials, Integer>{

}
