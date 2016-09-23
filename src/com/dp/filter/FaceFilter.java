package com.dp.filter;

public class FaceFilter implements Filter {

	@Override
	public void doFilter(Request req, Response res, Filter f) {
		req.msg = req.msg.replaceAll(":>", "^V^");
		f.doFilter(req, res, f);
		res.msg = res.msg.replaceAll("<V>", "~^V^~");
	}

}
