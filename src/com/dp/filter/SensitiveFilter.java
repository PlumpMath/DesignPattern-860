package com.dp.filter;

public class SensitiveFilter implements Filter {

	@Override
	public void doFilter(Request req, Response res, Filter f) {
		req.msg = req.msg.replaceAll("sensitive", "unsensitive");
		f.doFilter(req, res, f);
		res.msg = res.msg.replaceAll("no work", "a work");
	}

}
