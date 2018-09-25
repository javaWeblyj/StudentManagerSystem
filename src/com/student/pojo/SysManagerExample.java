package com.student.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysManagerExample {
	
	//升序还是降序:字段+空格+asc(desc)
    protected String orderByClause;
    
    //去除重复:true是选择不重复记录,false,反
    protected boolean distinct;
    
    //自定义查询条件
    protected List<Criteria> oredCriteria;

    public SysManagerExample() {
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
        if (oredCriteria.size() == 0) {
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

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andManIdIsNull() {
            addCriterion("man_id is null");
            return (Criteria) this;
        }

        public Criteria andManIdIsNotNull() {
            addCriterion("man_id is not null");
            return (Criteria) this;
        }

        public Criteria andManIdEqualTo(String value) {
            addCriterion("man_id =", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotEqualTo(String value) {
            addCriterion("man_id <>", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThan(String value) {
            addCriterion("man_id >", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdGreaterThanOrEqualTo(String value) {
            addCriterion("man_id >=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThan(String value) {
            addCriterion("man_id <", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLessThanOrEqualTo(String value) {
            addCriterion("man_id <=", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdLike(String value) {
            addCriterion("man_id like", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotLike(String value) {
            addCriterion("man_id not like", value, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdIn(List<String> values) {
            addCriterion("man_id in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotIn(List<String> values) {
            addCriterion("man_id not in", values, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdBetween(String value1, String value2) {
            addCriterion("man_id between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManIdNotBetween(String value1, String value2) {
            addCriterion("man_id not between", value1, value2, "manId");
            return (Criteria) this;
        }

        public Criteria andManPsdIsNull() {
            addCriterion("man_psd is null");
            return (Criteria) this;
        }

        public Criteria andManPsdIsNotNull() {
            addCriterion("man_psd is not null");
            return (Criteria) this;
        }

        public Criteria andManPsdEqualTo(String value) {
            addCriterion("man_psd =", value, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdNotEqualTo(String value) {
            addCriterion("man_psd <>", value, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdGreaterThan(String value) {
            addCriterion("man_psd >", value, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdGreaterThanOrEqualTo(String value) {
            addCriterion("man_psd >=", value, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdLessThan(String value) {
            addCriterion("man_psd <", value, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdLessThanOrEqualTo(String value) {
            addCriterion("man_psd <=", value, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdLike(String value) {
            addCriterion("man_psd like", value, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdNotLike(String value) {
            addCriterion("man_psd not like", value, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdIn(List<String> values) {
            addCriterion("man_psd in", values, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdNotIn(List<String> values) {
            addCriterion("man_psd not in", values, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdBetween(String value1, String value2) {
            addCriterion("man_psd between", value1, value2, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManPsdNotBetween(String value1, String value2) {
            addCriterion("man_psd not between", value1, value2, "manPsd");
            return (Criteria) this;
        }

        public Criteria andManNameIsNull() {
            addCriterion("man_name is null");
            return (Criteria) this;
        }

        public Criteria andManNameIsNotNull() {
            addCriterion("man_name is not null");
            return (Criteria) this;
        }

        public Criteria andManNameEqualTo(String value) {
            addCriterion("man_name =", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotEqualTo(String value) {
            addCriterion("man_name <>", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThan(String value) {
            addCriterion("man_name >", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThanOrEqualTo(String value) {
            addCriterion("man_name >=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThan(String value) {
            addCriterion("man_name <", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThanOrEqualTo(String value) {
            addCriterion("man_name <=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLike(String value) {
            addCriterion("man_name like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotLike(String value) {
            addCriterion("man_name not like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameIn(List<String> values) {
            addCriterion("man_name in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotIn(List<String> values) {
            addCriterion("man_name not in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameBetween(String value1, String value2) {
            addCriterion("man_name between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotBetween(String value1, String value2) {
            addCriterion("man_name not between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManLoginIsNull() {
            addCriterion("man_login is null");
            return (Criteria) this;
        }

        public Criteria andManLoginIsNotNull() {
            addCriterion("man_login is not null");
            return (Criteria) this;
        }

        public Criteria andManLoginEqualTo(Date value) {
            addCriterion("man_login =", value, "manLogin");
            return (Criteria) this;
        }

        public Criteria andManLoginNotEqualTo(Date value) {
            addCriterion("man_login <>", value, "manLogin");
            return (Criteria) this;
        }

        public Criteria andManLoginGreaterThan(Date value) {
            addCriterion("man_login >", value, "manLogin");
            return (Criteria) this;
        }

        public Criteria andManLoginGreaterThanOrEqualTo(Date value) {
            addCriterion("man_login >=", value, "manLogin");
            return (Criteria) this;
        }

        public Criteria andManLoginLessThan(Date value) {
            addCriterion("man_login <", value, "manLogin");
            return (Criteria) this;
        }

        public Criteria andManLoginLessThanOrEqualTo(Date value) {
            addCriterion("man_login <=", value, "manLogin");
            return (Criteria) this;
        }

        public Criteria andManLoginIn(List<Date> values) {
            addCriterion("man_login in", values, "manLogin");
            return (Criteria) this;
        }

        public Criteria andManLoginNotIn(List<Date> values) {
            addCriterion("man_login not in", values, "manLogin");
            return (Criteria) this;
        }

        public Criteria andManLoginBetween(Date value1, Date value2) {
            addCriterion("man_login between", value1, value2, "manLogin");
            return (Criteria) this;
        }

        public Criteria andManLoginNotBetween(Date value1, Date value2) {
            addCriterion("man_login not between", value1, value2, "manLogin");
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