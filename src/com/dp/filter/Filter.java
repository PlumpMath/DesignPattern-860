package com.dp.filter;

public interface Filter {
	public void doFilter(Request req, Response res, Filter f);
}
