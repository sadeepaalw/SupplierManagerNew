package com.supplier.manage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.supplier.manage.model.Materials;
import com.supplier.manage.repository.MaterialRepo;

public class MaterialServiceImpl implements MaterialService{

	@Autowired
	private MaterialRepo materialrepo;
	
	public MaterialRepo getMaterialrepo() {
		return materialrepo;
	}

	public void setMaterialrepo(MaterialRepo materialrepo) {
		this.materialrepo = materialrepo;
	}

	@Override
	public Materials saveMaterial(Materials materials) {
		
		return materialrepo.save(materials);
	}

	@Override
	public Materials updateMaterial(Materials materials) {
		
		return materialrepo.save(materials);
	}

	@Override
	public void deleteMaterial(Materials materials) {
		materialrepo.delete(materials);
	}

	@Override
	public List<Materials> getAllMaterials() {
		
		return materialrepo.findAll();
	}

}
