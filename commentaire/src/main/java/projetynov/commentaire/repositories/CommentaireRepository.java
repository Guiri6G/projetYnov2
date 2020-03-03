package projetynov.commentaire.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetynov.commentaire.model.Commentaire;


@Repository
public interface CommentaireRepository extends CrudRepository<Commentaire, Long>{
	
	public Commentaire findById(String Id);
		
}

