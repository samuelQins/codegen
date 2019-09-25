
package com.wildcat.codegen.util;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 响应信息主体
 *
 * @param <T>
 * @author lengleng
 */
@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class Result<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private int code = 0;

	@Getter
	@Setter
	private String msg = "success";


	@Getter
	@Setter
	private T data;

	public Result() {
		super();
	}

	public Result(T data) {
		super();
		this.data = data;
	}

	public Result(T data, String msg) {
		super();
		this.data = data;
		this.msg = msg;
	}

	public Result(Throwable e) {
		super();
		this.msg = e.getMessage();
		this.code = -1;
	}

	public Result(int code, T data) {
		super();
		this.code = code;
		this.data = data;
	}
}
