package com.dp.factory;

public class CarFactory extends VehicleFactory{
	public Moveable create() {
		return new Car();
	}
}
