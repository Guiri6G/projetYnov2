package projetynov.commentaire.restcontroller;

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

import projetynov.commentaire.model.*;
import projetynov.commentaire.repositories.*;


@RestController
public class CommentaireController {

	@Autowired
	private CommentaireRepository commentaireRepository;
	
	@GetMapping(value = "/commentaire/{id}")
	public Optional<Commentaire> getCommentaire(@PathVariable Long id) {
		return commentaireRepository.findById(id);
	}
	
	@GetMapping(value = "/commentaires")
	public List<Commentaire> getCommentaire() {
		System.out.println("trace getCommentaire");
		List<Commentaire> commentaires = new ArrayList<Commentaire>(); 
		commentaireRepository.findAll().forEach(commentaires::add);
		return commentaires;
	}
	
	@PostMapping(value = "/add") 
	public void addArticle(@RequestBody Commentaire u) {
		commentaireRepository.save(u);
	}
	
	@PutMapping(value = "/update")
	public void updateArticle(@RequestBody Commentaire u) {
		commentaireRepository.save(u);
	}
	
	@DeleteMapping(value = "/delete")
	public void deleteArticle(@RequestBody Commentaire u) {
		commentaireRepository.delete(u);
	}	
	

 	
}