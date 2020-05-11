package com.uca.Laboratorio4.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {

	@AssertTrue(message = "No puedes agregar tu producto porque no eres un robot, favor hacer click en regresar")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
	
	
}
