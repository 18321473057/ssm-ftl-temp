package org.line.ssm.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="commonbean")
public class CommonBean {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    /**禁止序列化, 该字段不会被序列化到json中*/
//    @JsonIgnore
    private String passWord;
    private Date createTime;
    private Long createUserId;
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
    public Long getCreateUserId() {
        return createUserId;
    }
    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }
    @Override
    public String toString() {
        return "CommonBean [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", createTime=" + createTime + ", createUserId=" + createUserId
                + "]";
    }
 
   
    
    
}
