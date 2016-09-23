package com.dp.filter;

public class UserProcess implements Process {

	@Override
	public void process(Request req, Response res) {
		res.msg = req.msg + "they have no work now <V>";
	}

}
