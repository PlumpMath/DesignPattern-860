package com.dp.factory;

public class BroomFactory extends VehicleFactory{
	public Moveable create() {
		return new Broom();
	}
}
