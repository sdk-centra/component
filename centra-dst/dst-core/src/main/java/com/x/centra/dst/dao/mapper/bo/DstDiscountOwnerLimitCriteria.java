package com.x.centra.dst.dao.mapper.bo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.x.base.exception.SystemException;

public class DstDiscountOwnerLimitCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public DstDiscountOwnerLimitCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.isEmpty()) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return !criteria.isEmpty();
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new SystemException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new SystemException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new SystemException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNull() {
            addCriterion("DISCOUNT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIsNotNull() {
            addCriterion("DISCOUNT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeEqualTo(String value) {
            addCriterion("DISCOUNT_CODE =", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotEqualTo(String value) {
            addCriterion("DISCOUNT_CODE <>", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThan(String value) {
            addCriterion("DISCOUNT_CODE >", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_CODE >=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThan(String value) {
            addCriterion("DISCOUNT_CODE <", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_CODE <=", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeLike(String value) {
            addCriterion("DISCOUNT_CODE like", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotLike(String value) {
            addCriterion("DISCOUNT_CODE not like", value, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeIn(List<String> values) {
            addCriterion("DISCOUNT_CODE in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotIn(List<String> values) {
            addCriterion("DISCOUNT_CODE not in", values, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeBetween(String value1, String value2) {
            addCriterion("DISCOUNT_CODE between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andDiscountCodeNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_CODE not between", value1, value2, "discountCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeIsNull() {
            addCriterion("OWNER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeIsNotNull() {
            addCriterion("OWNER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeEqualTo(String value) {
            addCriterion("OWNER_CODE =", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeNotEqualTo(String value) {
            addCriterion("OWNER_CODE <>", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeGreaterThan(String value) {
            addCriterion("OWNER_CODE >", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER_CODE >=", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeLessThan(String value) {
            addCriterion("OWNER_CODE <", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeLessThanOrEqualTo(String value) {
            addCriterion("OWNER_CODE <=", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeLike(String value) {
            addCriterion("OWNER_CODE like", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeNotLike(String value) {
            addCriterion("OWNER_CODE not like", value, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeIn(List<String> values) {
            addCriterion("OWNER_CODE in", values, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeNotIn(List<String> values) {
            addCriterion("OWNER_CODE not in", values, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeBetween(String value1, String value2) {
            addCriterion("OWNER_CODE between", value1, value2, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andOwnerCodeNotBetween(String value1, String value2) {
            addCriterion("OWNER_CODE not between", value1, value2, "ownerCode");
            return (Criteria) this;
        }

        public Criteria andLimitStatusIsNull() {
            addCriterion("LIMIT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andLimitStatusIsNotNull() {
            addCriterion("LIMIT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andLimitStatusEqualTo(String value) {
            addCriterion("LIMIT_STATUS =", value, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusNotEqualTo(String value) {
            addCriterion("LIMIT_STATUS <>", value, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusGreaterThan(String value) {
            addCriterion("LIMIT_STATUS >", value, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_STATUS >=", value, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusLessThan(String value) {
            addCriterion("LIMIT_STATUS <", value, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_STATUS <=", value, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusLike(String value) {
            addCriterion("LIMIT_STATUS like", value, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusNotLike(String value) {
            addCriterion("LIMIT_STATUS not like", value, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusIn(List<String> values) {
            addCriterion("LIMIT_STATUS in", values, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusNotIn(List<String> values) {
            addCriterion("LIMIT_STATUS not in", values, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusBetween(String value1, String value2) {
            addCriterion("LIMIT_STATUS between", value1, value2, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andLimitStatusNotBetween(String value1, String value2) {
            addCriterion("LIMIT_STATUS not between", value1, value2, "limitStatus");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("CREATE_USER_ID like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("CREATE_USER_ID not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Timestamp value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Timestamp value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Timestamp> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Timestamp> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}