package com.cap.demo.service;
import com.cap.demo.repository.TraineeRepository;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.demo.entity.Trainee;
import com.cap.demo.repository.TraineeRepository;

@Service("service") // TraineeServiceImpl service=new TraineeServiceImpl()
@Transactional
public class TraineeServiceImpl implements TraineeService {
	@Autowired
	TraineeRepository dao;

	public void addTrainee(Trainee trainee) {
		dao.addTrainee(trainee);
	}

	public void updateTrainee(Trainee trainee) {
		dao.updateTrainee(trainee);
	}

	public void removeTrainee(int traineeId) {
		dao.removeTrainee(traineeId);
	}

	public Trainee getTraineeById(int traineeId) {
		return dao.getTraineeById(traineeId);
	}

	public List<Trainee> getAllTrainees() {

		return dao.getAllTrainees();
	}
}
