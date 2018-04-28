package com.taotao.common.pojo;

import java.util.Date;

public class ItemParamResult {

	private Long id;
	private Long item_cat_id;//商品类目id
	private String name;//商品类目name
	private String paramGroup;//商品分组名称
	private Date createDate;
	private Date updateDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getItem_cat_id() {
		return item_cat_id;
	}
	public void setItem_cat_id(Long item_cat_id) {
		this.item_cat_id = item_cat_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParamGroup() {
		return paramGroup;
	}
	public void setParamGroup(String paramGroup) {
		this.paramGroup = paramGroup;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
}
