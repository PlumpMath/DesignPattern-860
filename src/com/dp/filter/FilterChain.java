package com.dp.filter;

import java.util.ArrayList;

public class FilterChain implements Filter{
	public Process p;
	public ArrayList<Filter> filters = new ArrayList<Filter>();
	public int index = 0;
	@Override
	public void doFilter(Request req, Response res, Filter f) {
		if(index == filters.size()) {
			this.p.process(req, res);
			return;
		}
		filters.get(index++).doFilter(req, res, f);
	}

	public void setProcess(Process p) {
		this.p = p;		
	}

	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;
	}

}
