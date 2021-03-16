package com.cap.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cap.demo.entity.Trainee;

public class TraineeDaoImpl implements TraineeRepository{
	@PersistenceContext
	EntityManager entityManager;

	public void addTrainee(Trainee trainee) {
		entityManager.persist(trainee);
	}

	public void updateTrainee(Trainee trainee) {
		entityManager.merge(trainee);
	}

	public void removeTrainee(int traineeId) {
		Trainee trainee = entityManager.find(Trainee.class, traineeId);
		entityManager.remove(entityManager.merge(trainee));

	}

	public Trainee getTraineeById(int traineeId) {
		Trainee trainee = entityManager.find(Trainee.class, traineeId);
		return trainee;
	}

	public List<Trainee> getAllTrainees() {
		Query q = entityManager.createQuery("select e from Trainee e");
		List<Trainee> l = q.getResultList();
		return l;
	}

}
