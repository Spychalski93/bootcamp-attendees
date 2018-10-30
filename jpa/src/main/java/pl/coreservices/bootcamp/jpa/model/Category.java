package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
@Table(name = "Category")
public class Category {

	@Id
	@Column (name = "name")
	private String name;

	@Column (name = "parent")
	private Category parent;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getParent() {
		return parent;
	}

	public void setParent(Category parent) {
		this.parent = parent;
	}
}
