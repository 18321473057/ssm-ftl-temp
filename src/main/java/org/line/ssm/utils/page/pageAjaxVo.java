package org.line.ssm.utils.page;

import java.util.List;

import org.line.ssm.pojo.CommonBean;

public class pageAjaxVo<T> {
	private Integer sEcho;// 操作标识
	private long iTotalRecords;// 数据总条数
	private long iTotalDisplayRecords;// 数据显示
	private List<T> aaData;// 数据源

	public pageAjaxVo(pageParamVo page, List<T> beans, long toolsNum) {
		this.sEcho = page.getsEcho();
		this.iTotalRecords = toolsNum;
		this.iTotalDisplayRecords = toolsNum;
		this.aaData = beans;
	}

	public Integer getsEcho() {
		return sEcho;
	}

	public void setsEcho(Integer sEcho) {
		this.sEcho = sEcho;
	}

	public long getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(long iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public long getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(long iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	public List<T> getAaData() {
		return aaData;
	}

	public void setAaData(List<T> aaData) {
		this.aaData = aaData;
	}

 
	 
}
