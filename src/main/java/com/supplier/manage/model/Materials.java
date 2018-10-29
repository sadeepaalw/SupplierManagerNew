package com.supplier.manage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materials")
public class Materials {

	@Id
	@GeneratedValue
	private Integer id;
	@Column(name="name")
	private String name;
	
	public Materials() {
		super();
	}
	public Materials(Integer id, String name) {
		this();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Materials [id=" + id + ", name=" + name + "]";
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
	
	
}
