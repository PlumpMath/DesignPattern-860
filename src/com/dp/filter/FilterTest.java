package com.dp.filter;


public class FilterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Request  req = new Request("hello everyone, this a sensitive words, :> ...");
		Response res = new Response();
		
		Process p = new UserProcess();
		FilterChain fc = new FilterChain();
		fc.addFilter(new SensitiveFilter()).addFilter(new FaceFilter());
		fc.setProcess(p);
		fc.doFilter(req, res, fc);
		
		System.out.println(req + "<->" + res);
	}

}
