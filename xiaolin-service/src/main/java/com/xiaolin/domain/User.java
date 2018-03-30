package com.xiaolin.domain;

import java.util.Date;

public class User {
	
	private Long userId;
	private String username;
	private String headUrl;
	private String password;
	private String mobile;
	private String email;
	private String wechat;
	private Integer tickets;
	private Integer beans;
	private Integer balance;
	private String openId;
	private Date noticeTime;
	private Date loginTime;
	private Integer succOrders;
	private Integer vipFlag;
	private Integer status;
	private Date gmtCreate;
	private Date gmtModify;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public Integer getTickets() {
		return tickets;
	}
	public void setTickets(Integer tickets) {
		this.tickets = tickets;
	}
	public Integer getBeans() {
		return beans;
	}
	public void setBeans(Integer beans) {
		this.beans = beans;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public Date getNoticeTime() {
		return noticeTime;
	}
	public void setNoticeTime(Date noticeTime) {
		this.noticeTime = noticeTime;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public Integer getSuccOrders() {
		return succOrders;
	}
	public void setSuccOrders(Integer succOrders) {
		this.succOrders = succOrders;
	}
	public Integer getVipFlag() {
		return vipFlag;
	}
	public void setVipFlag(Integer vipFlag) {
		this.vipFlag = vipFlag;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	public Date getGmtModify() {
		return gmtModify;
	}
	public void setGmtModify(Date gmtModify) {
		this.gmtModify = gmtModify;
	}

}
