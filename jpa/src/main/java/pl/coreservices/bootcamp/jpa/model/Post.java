package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Entity
@Table (name = "post")
public class Post extends Content {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;

	@Column (name = "main_category")
	@ManyToOne
	@JoinColumn (name = "main_category_id")
	private Category mainCategory;
	@ManyToMany
	@Column(name = "categories")
	private Set<Category> categories;

	@Embedded
	@ManyToMany
	private Set<Comment> comments;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Category getMainCategory() {
		return mainCategory;
	}

	public void setMainCategory(Category mainCategory) {
		this.mainCategory = mainCategory;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
}
