package com.x.centra.cust.web.model.discount;

import java.io.Serializable;

public class DiscountInfoResVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String discountId;

    private String tenantId;

    private String discountName;

    private String discountCode;

    private String classCode;
    
    private String className;

    private String discountInstructions;

    private String discountType;
    
    private String discountTypeName;

    private String effectiveTime;

    private String effectiveUnit;

    private String status;

    private String verifyState;

    private String createUserId;

    private Long createDate;
    
    private String createDateStr;

    private String remark;

	public String getDiscountId() {
		return discountId;
	}

	public void setDiscountId(String discountId) {
		this.discountId = discountId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getDiscountName() {
		return discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDiscountInstructions() {
		return discountInstructions;
	}

	public void setDiscountInstructions(String discountInstructions) {
		this.discountInstructions = discountInstructions;
	}

	public String getDiscountType() {
		return discountType;
	}

	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}
	
	public String getDiscountTypeName() {
		return discountTypeName;
	}

	public void setDiscountTypeName(String discountTypeName) {
		this.discountTypeName = discountTypeName;
	}

	public String getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getEffectiveUnit() {
		return effectiveUnit;
	}

	public void setEffectiveUnit(String effectiveUnit) {
		this.effectiveUnit = effectiveUnit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVerifyState() {
		return verifyState;
	}

	public void setVerifyState(String verifyState) {
		this.verifyState = verifyState;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Long getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
	}

	public String getCreateDateStr() {
		return createDateStr;
	}

	public void setCreateDateStr(String createDateStr) {
		this.createDateStr = createDateStr;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
