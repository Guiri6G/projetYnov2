package projetynov.article.restcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projetynov.article.model.Article;
import projetynov.article.repositories.ArticleRepository;


@RestController
public class ArticleController {

	@Autowired
	private ArticleRepository articleRepository;
	
	@GetMapping(value = "/article/{id}")
	public Optional<Article> getArticle(@PathVariable Long id) {
		return articleRepository.findById(id);
	}
	
	@GetMapping(value = "/articles")
	public List<Article> getArticles() {
		System.out.println("trace getArticles");
		List<Article> articles = new ArrayList<Article>(); 
		articleRepository.findAll().forEach(articles::add);
		return articles;
	}
	
	@PostMapping(value = "/add") 
	public void addArticle(@RequestBody Article u) {
		articleRepository.save(u);
	}
	
	@PutMapping(value = "/update")
	public void updateArticle(@RequestBody Article u) {
		articleRepository.save(u);
	}
	
	@DeleteMapping(value = "/delete")
	public void deleteArticle(@RequestBody Article u) {
		articleRepository.delete(u);
	}	
	

 	
}
