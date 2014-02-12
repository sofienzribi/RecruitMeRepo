package tn.edu.esprit.gl8.recruitMe.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.gl8.recruitMe.domain.Resume;
import tn.edu.esprit.gl8.recruitMe.domain.User;

@Remote
public interface UserServicesRemote {
	
	public void addUser(User user);
	public void addResume(Resume resume);
	public void RemoveResume(Resume resume);
	public void UpdateResume(Resume resume);
	public Resume GetResumeById(int idresume);
	
	

}
