package com.xiaolin.emnus;

import com.xiaolin.fish.common.exception.ErrorCode;
import com.xiaolin.fish.common.exception.v1.ErrorLevel;
import com.xiaolin.fish.common.exception.v1.ErrorType;
import com.xiaolin.fish.common.exception.v1.V1ErrorCode;

/**
 * 定义机构错误码类型
 *
 * @author zhutx
 *
 */
public enum XiaolinErrorCode implements ErrorCode {

	PARAM_WRONG(new V1ErrorCode(ErrorType.SERVICE, ErrorLevel.WARN, "021", "0001"), "参数有误"),

	FAVORITE_CONTAINS_MENU(new V1ErrorCode(ErrorType.SERVICE, ErrorLevel.WARN, "021", "0002"), "该收藏夹下存在菜谱"),

	TICKET_STATUS_FAIL(new V1ErrorCode(ErrorType.SERVICE, ErrorLevel.WARN, "021", "0002"), "菜票状态异常"),

	NOT_YOUR_TICKET(new V1ErrorCode(ErrorType.SERVICE, ErrorLevel.WARN, "021", "0002"), "菜票归属异常"),

	COUPON_CODE_FAIL(new V1ErrorCode(ErrorType.SERVICE, ErrorLevel.WARN, "021", "0002"), "无效优惠码"),

	ORDER_NO_GOODS(new V1ErrorCode(ErrorType.SERVICE, ErrorLevel.WARN, "021", "0002"), "无商品信息"),

	ACCOUNT_FAIL(new V1ErrorCode(ErrorType.SERVICE, ErrorLevel.WARN, "021", "0002"), "账号或密码错误"),

	ACCOUNT_DISABLE(new V1ErrorCode(ErrorType.SERVICE, ErrorLevel.WARN, "021", "0002"), "账号状态异常"),

	;

	/** 错误码，不能为空 */
	private V1ErrorCode errorCode;

	/** 错误信息，一般情况下不能为空 */
	private String errorMessage;

	XiaolinErrorCode(V1ErrorCode errorCode, String errorMessage) {
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	@Override
	public String getCode() {
		return this.errorCode.getCode();
	}

	/**
	 * @return the errorMessage
	 */
	public String getMessage() {
		return errorMessage;
	}

}
