package com.supplier.manage.services;

import java.util.List;

import com.supplier.manage.model.Materials;

public interface MaterialService {

	Materials saveMaterial(Materials materials);
	Materials updateMaterial(Materials materials);
	void deleteMaterial(Materials materials);
	List<Materials> getAllMaterials();
}
