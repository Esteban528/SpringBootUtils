package com.bytecode.core.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bytecode.core.model.Post;

@Component("com.bytecode.core.components.PostComponent")
public class PostComponent {
	
	public List<Post> getPosts() {
		ArrayList<Post> post = new ArrayList<>();
		post.add(new Post(1, "Some quick example text to build on the card title and make up the bulk of the card's content.", "http://localhost:81/img/post.png", new Date(), "Desarrollo web Java"));
		post.add(new Post(2, "Some quick example text to build on the card title and make up the bulk of the card's content.", "http://localhost:81/img/post.png", new Date(), "Desarrollo web python"));
		post.add(new Post(4, "Some quick example text to build on the card title and make up the bulk of the card's content.", "http://localhost:81/img/post.png", new Date(), "Desarrollo web node"));
		post.add(new Post(4, "Some quick example text to build on the card title and make up the bulk of the card's content.", "http://localhost:81/img/post.png", new Date(), "Desarrollo web .NET"));

		return post;
	}
}
