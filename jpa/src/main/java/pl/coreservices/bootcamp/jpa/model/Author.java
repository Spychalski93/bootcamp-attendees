package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;


/**
 * Created by BKuczynski on 2016-12-14.
 */

@Embeddable
@Table (name = "author")
public class Author implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column (name = "name", nullable = false)
	private String name;

	@OneToMany(mappedBy = "author")
	@Column (name = "articles")
	private Set<Content> articles;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Author author = (Author) o;
		return id == author.id && Objects.equals(name, author.name) && Objects.equals(articles, author.articles);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, articles);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getArticles() {
		return articles;
	}

	public void setArticles(Set<Content> articles) {
		this.articles = articles;
	}

}
