package com.cap.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainees")
public class Trainee {
	@Id
	@GeneratedValue
	private int traineeId;
	private String traineeName;
	private String batchName;

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", batchName=" + batchName + "]";
	}
	public Trainee( String traineeName, String traineeBatch) {
		super();
		this.traineeName = traineeName;
		this.batchName = traineeBatch;
	}

	public Trainee(int traineeId, String traineeName, String batchName) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.batchName = batchName;
	}

	public Trainee() {
		// TODO Auto-generated constructor stub
	}
}
