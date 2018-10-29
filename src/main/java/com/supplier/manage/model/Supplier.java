package com.supplier.manage.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="supplier")
public class Supplier {

	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Set<Materials> materials;
	public Supplier() {
		super();
	}
	public Supplier(Integer id, String name, Set<Materials> materials) {
		this();
		this.id = id;
		this.name = name;
		this.materials = materials;
	}
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", materials=" + materials + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Materials> getMaterials() {
		return materials;
	}
	public void setMaterials(Set<Materials> materials) {
		this.materials = materials;
	}
	
	
}
