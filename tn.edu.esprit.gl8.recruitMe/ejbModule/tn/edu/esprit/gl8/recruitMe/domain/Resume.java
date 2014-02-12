package tn.edu.esprit.gl8.recruitMe.domain;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Resume
 *
 */
@Entity

public class Resume implements Serializable {

	
	private int id;
	private String diplome;
	private String experience;
	private static final long serialVersionUID = 1L;
	
	private User user;

	public Resume() {
		super();
	}   
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getDiplome() {
		return this.diplome;
	}

	public Resume(String diplome, String experience) {
		super();
		this.diplome = diplome;
		this.experience = experience;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}   
	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
	@OneToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
   
}
