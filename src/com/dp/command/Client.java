package com.dp.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Boy b = new Boy();
		MM  m = new MM();
		
		m.order(b);
	}

}
