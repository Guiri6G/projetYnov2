package projetynov.article.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
	@Column(name="reference")
	private String reference;
	@Column(name="nom")
	private String nom;
	@Column(name="quantite")
	private int quantite;
	@Column(name="idCategorie")
	private String idCategorie;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(String idCategorie) {
		this.idCategorie = idCategorie;
	}

	
}
