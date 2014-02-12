package tn.edu.esprit.gl8.recruitMe.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.gl8.recruitMe.domain.Resume;
import tn.edu.esprit.gl8.recruitMe.domain.User;
import tn.edu.esprit.gl8.recruitMe.services.interfaces.UserServicesLocal;
import tn.edu.esprit.gl8.recruitMe.services.interfaces.UserServicesRemote;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public UserServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);

	}

	@Override
	public void addResume(Resume resume) {
		entityManager.persist(resume);

	}

	@Override
	public void RemoveResume(Resume resume) {
		entityManager.remove(entityManager.merge(resume));

	}

	@Override
	public void UpdateResume(Resume resume) {
		entityManager.merge(resume);

	}

	@Override
	public Resume GetResumeById(int idresume) {
		Resume resume = entityManager.find(Resume.class, idresume);
		return resume;

	}

}
