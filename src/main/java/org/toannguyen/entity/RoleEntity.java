package org.toannguyen.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity // day la mot entity
@Table(name = "role") // dai dien table new trong database
public class RoleEntity extends BaseEntity {

	@Column(name = "name")
	private String name;

	@Column(name = "code")
	private String code;

	@ManyToMany(mappedBy = "roles")
	private List<UserEntity> users = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
