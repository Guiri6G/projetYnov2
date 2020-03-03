package projetynov.article.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projetynov.article.model.Article;


@Repository
public interface ArticleRepository extends CrudRepository<Article, Long>{
	
	public Article findById(String Id);
	
	public Optional<Article> findByIdAndIdCategorie(String Id, String IdCategorie);
	
}

