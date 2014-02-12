package tn.edu.esprit.gl8.recruitMe.domain;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity

public class User implements Serializable {

	
	private int id;
	private String nickname;
	private String password;
	private static final long serialVersionUID = 1L;
	private Resume resume;

	public User() {
		super();
	}   
	public User(String nickname, String password) {
		super();
		this.nickname = nickname;
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	@OneToOne(mappedBy="user")
	public Resume getResume() {
		return resume;
	}
	public void setResume(Resume resume) {
		this.resume = resume;
	}
	public void linkUserWithResume(Resume resume) {
		this.resume = resume;
		resume.setUser(this);
		
	}
   
}
