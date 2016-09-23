/**
 * 用户处理request, 并设置response
 */
package com.dp.filter;

/**
 * @author admin
 *
 */
public interface Process {
	public void process(Request req, Response res);
}
