package com.yingjun.ssm.entity;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.yingjun.ssm.util.CustomDateSerializer;



/**
 * 用户
 * @author yingjun
 *
 */
public class User {
	
	private long userId;
	
	private String userName;
	
	private long userPhone;
	
	/**
	    此注解用于属性或者getter方法上，用于在序列化时嵌入我们自定义的代码
	    自定义返回JSON 数据格中日期格式化处理 
	 */
	
	@JsonSerialize(using = CustomDateSerializer.class) 
	private Date createTime;
	
	private int score;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPhone=" + userPhone + ", createTime=" + createTime + ", score=" + score
				+ "]";
	}

	

}
