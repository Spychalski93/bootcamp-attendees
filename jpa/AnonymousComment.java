package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;

/**
 * Created by BKuczynski on 2016-12-15.
 */

@Entity
@Table (name = "Anonymous_comment")
public class AnonymousComment extends Comment{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column (name = "author_name")
	private String authorName;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}


}
