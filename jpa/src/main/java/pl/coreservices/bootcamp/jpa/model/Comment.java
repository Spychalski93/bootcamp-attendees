package pl.coreservices.bootcamp.jpa.model;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by BKuczynski on 2016-12-14.
 */
@Embeddable
@Table (name = "comments")
public class Comment {

	@Id
	@Column(name = "posted_at")
	private LocalDateTime postedAt;
	@Column(name = "content")
	private String content;

	@OneToMany (mappedBy = "comment")
	@PrimaryKeyJoinColumn (name = "post_id")
	@Column(name = "post")
	private Post post;


	public LocalDateTime getPostedAt() {
		return postedAt;
	}

	public void setPostedAt(LocalDateTime postedAt) {
		this.postedAt = postedAt;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}
