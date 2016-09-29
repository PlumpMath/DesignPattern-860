package com.dp.bridge;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boy b = new Boy();
		MM  m = new MM();
		b.give(new WarmGift(new Ring()), m);
		
	}

}
