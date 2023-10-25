package com.bytecode.core.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bytecode.core.components.PostComponent;
import com.bytecode.core.configuration.Pages;
import com.bytecode.core.model.Post;

@Controller
@RequestMapping(value = "/home")
public class ControllerBasic {
	
	@Autowired
	@Qualifier("com.bytecode.core.components.PostComponent")
	private PostComponent _postComponent;
	
	@GetMapping(path = {"/posts", "/"})
	public String saludar(Model model) {
		model.addAttribute("posts", this._postComponent.getPosts()); 
		return "index";
	}
	
	
		@GetMapping(path = "/public")
	public ModelAndView post() {
		ModelAndView modelAndView = new ModelAndView(Pages.HOME);
		modelAndView.addObject("posts", this._postComponent.getPosts());
		
		return modelAndView;
	}
	
	@GetMapping(path = {"/post"})
	public ModelAndView getPostIndividual(
			@RequestParam(defaultValue="1", name="id", required = false) int id
			) {
		ModelAndView modelAndView = new ModelAndView(Pages.POST);
		List<Post> postFiltrado = this._postComponent.getPosts().stream()
											.filter((post) -> {
												return post.getId() == id;
											}).collect(Collectors.toList());
		
		modelAndView.addObject("post", postFiltrado.get(0));
		return modelAndView;
	}
	
	@GetMapping(path = {"/post", "/post/p/{post}"})
	public ModelAndView getPostIndividual2(
			
			@PathVariable(required=true, name = "post") 
			int id
			
			) {
		ModelAndView modelAndView = new ModelAndView(Pages.POST);
		List<Post> postFiltrado = this._postComponent.getPosts().stream()
											.filter((post) -> {
												return post.getId() == id;
											}).collect(Collectors.toList());
		
		modelAndView.addObject("post", postFiltrado.get(0));
		return modelAndView;
	
	}
	
	@GetMapping("/postNew")
	public ModelAndView getForm() {
		ModelAndView modelAndView = new ModelAndView("form");
		modelAndView.addObject("post", new Post());
		
		return modelAndView;
	}
	
	@PostMapping("/addNewPost")
	public String addNewPost(Post post, Model model) {
		List<Post> posts = this._postComponent.getPosts();
		posts.add(post);
		model.addAttribute("posts", posts);
		return "index";
	}
}
