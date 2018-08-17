package org.line.ssm.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class CommonBean {
    private Long id;
    private String userName;
    /**禁止序列化, 该字段不会被序列化到json中*/
//    @JsonIgnore
    private String passWord;
    private Date createTime;
    private Long createUserID;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getCreateUserID() {
		return createUserID;
	}
	public void setCreateUserID(Long createUserID) {
		this.createUserID = createUserID;
	}
	@Override
	public String toString() {
		return "CommonBean [id=" + id + ", userName=" + userName
				+ ", passWord=" + passWord + ", createTime=" + createTime
				+ ", createUserID=" + createUserID + "]";
	}
    
   
    
    
}
