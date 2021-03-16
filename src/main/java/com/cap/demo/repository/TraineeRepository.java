package com.cap.demo.repository;

import java.util.List;

import com.cap.demo.entity.Trainee;



public interface TraineeRepository {
void addTrainee(Trainee trainee);
void updateTrainee(Trainee trainee);
void removeTrainee(int traineeId);
Trainee getTraineeById(int traineeId);
List<Trainee>getAllTrainees();


}
