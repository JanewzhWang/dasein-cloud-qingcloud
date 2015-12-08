package org.dasein.cloud.qingcloud.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DescribeVxnetsResponseItemModel {

	@JsonProperty("vxnet_type")
	private Integer vxnetType;
	@JsonProperty("vxnet_id")
	private String vxnetId;
	@JsonProperty("vxnet_name")
	private String vxnetName;
	@JsonProperty("create_time")
	private String createTime;
	@JsonProperty("description")
	private String description;
	@JsonProperty("router")
	private Map router;
	
	public Integer getVxnetType() {
		return vxnetType;
	}
	public void setVxnetType(Integer vxnetType) {
		this.vxnetType = vxnetType;
	}
	public String getVxnetId() {
		return vxnetId;
	}
	public void setVxnetId(String vxnetId) {
		this.vxnetId = vxnetId;
	}
	public String getVxnetName() {
		return vxnetName;
	}
	public void setVxnetName(String vxnetName) {
		this.vxnetName = vxnetName;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Map getRouter() {
		return router;
	}
	public void setRouter(Map router) {
		this.router = router;
	}
}