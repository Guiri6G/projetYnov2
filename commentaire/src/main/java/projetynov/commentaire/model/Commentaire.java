package projetynov.commentaire.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Commentaire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Long id;
	@Column(name="dateCom")
	private Date DateCom;
	@Column(name="textCom")
	private String textCom;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateCom() {
		return DateCom;
	}
	public void setDateCom(Date dateCom) {
		DateCom = dateCom;
	}
	public String getTextCom() {
		return textCom;
	}
	public void setTextCom(String textCom) {
		this.textCom = textCom;
	}

}