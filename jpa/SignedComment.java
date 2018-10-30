package pl.coreservices.bootcamp.jpa.model;

/**
 * Created by BKuczynski on 2016-12-15.
 */
public class SignedComment extends Comment {

	private Author author;

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
}
