package pl.devopsi.akademia.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "post_entity")
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String text;
	@ManyToOne
	private User user;

	public Post() {
	}

	public Post(String title, String text) {
		this.title = title;
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		user.getPosts().add(this);
		this.user = user;
	}
}
