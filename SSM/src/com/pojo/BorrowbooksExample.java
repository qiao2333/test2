package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BorrowbooksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BorrowbooksExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBooknoIsNull() {
            addCriterion("BookNo is null");
            return (Criteria) this;
        }

        public Criteria andBooknoIsNotNull() {
            addCriterion("BookNo is not null");
            return (Criteria) this;
        }

        public Criteria andBooknoEqualTo(Long value) {
            addCriterion("BookNo =", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoNotEqualTo(Long value) {
            addCriterion("BookNo <>", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoGreaterThan(Long value) {
            addCriterion("BookNo >", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoGreaterThanOrEqualTo(Long value) {
            addCriterion("BookNo >=", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoLessThan(Long value) {
            addCriterion("BookNo <", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoLessThanOrEqualTo(Long value) {
            addCriterion("BookNo <=", value, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoIn(List<Long> values) {
            addCriterion("BookNo in", values, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoNotIn(List<Long> values) {
            addCriterion("BookNo not in", values, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoBetween(Long value1, Long value2) {
            addCriterion("BookNo between", value1, value2, "bookno");
            return (Criteria) this;
        }

        public Criteria andBooknoNotBetween(Long value1, Long value2) {
            addCriterion("BookNo not between", value1, value2, "bookno");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("CardNo is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("CardNo is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(Long value) {
            addCriterion("CardNo =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(Long value) {
            addCriterion("CardNo <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(Long value) {
            addCriterion("CardNo >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(Long value) {
            addCriterion("CardNo >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(Long value) {
            addCriterion("CardNo <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(Long value) {
            addCriterion("CardNo <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<Long> values) {
            addCriterion("CardNo in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<Long> values) {
            addCriterion("CardNo not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(Long value1, Long value2) {
            addCriterion("CardNo between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(Long value1, Long value2) {
            addCriterion("CardNo not between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andBdateIsNull() {
            addCriterion("Bdate is null");
            return (Criteria) this;
        }

        public Criteria andBdateIsNotNull() {
            addCriterion("Bdate is not null");
            return (Criteria) this;
        }

        public Criteria andBdateEqualTo(Date value) {
            addCriterion("Bdate =", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotEqualTo(Date value) {
            addCriterion("Bdate <>", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThan(Date value) {
            addCriterion("Bdate >", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Bdate >=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThan(Date value) {
            addCriterion("Bdate <", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateLessThanOrEqualTo(Date value) {
            addCriterion("Bdate <=", value, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateIn(List<Date> values) {
            addCriterion("Bdate in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotIn(List<Date> values) {
            addCriterion("Bdate not in", values, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateBetween(Date value1, Date value2) {
            addCriterion("Bdate between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andBdateNotBetween(Date value1, Date value2) {
            addCriterion("Bdate not between", value1, value2, "bdate");
            return (Criteria) this;
        }

        public Criteria andRdateIsNull() {
            addCriterion("Rdate is null");
            return (Criteria) this;
        }

        public Criteria andRdateIsNotNull() {
            addCriterion("Rdate is not null");
            return (Criteria) this;
        }

        public Criteria andRdateEqualTo(Date value) {
            addCriterion("Rdate =", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotEqualTo(Date value) {
            addCriterion("Rdate <>", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThan(Date value) {
            addCriterion("Rdate >", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThanOrEqualTo(Date value) {
            addCriterion("Rdate >=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThan(Date value) {
            addCriterion("Rdate <", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThanOrEqualTo(Date value) {
            addCriterion("Rdate <=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateIn(List<Date> values) {
            addCriterion("Rdate in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotIn(List<Date> values) {
            addCriterion("Rdate not in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateBetween(Date value1, Date value2) {
            addCriterion("Rdate between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotBetween(Date value1, Date value2) {
            addCriterion("Rdate not between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andCdIsNull() {
            addCriterion("cd is null");
            return (Criteria) this;
        }

        public Criteria andCdIsNotNull() {
            addCriterion("cd is not null");
            return (Criteria) this;
        }

        public Criteria andCdEqualTo(Boolean value) {
            addCriterion("cd =", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotEqualTo(Boolean value) {
            addCriterion("cd <>", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThan(Boolean value) {
            addCriterion("cd >", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("cd >=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThan(Boolean value) {
            addCriterion("cd <", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdLessThanOrEqualTo(Boolean value) {
            addCriterion("cd <=", value, "cd");
            return (Criteria) this;
        }

        public Criteria andCdIn(List<Boolean> values) {
            addCriterion("cd in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotIn(List<Boolean> values) {
            addCriterion("cd not in", values, "cd");
            return (Criteria) this;
        }

        public Criteria andCdBetween(Boolean value1, Boolean value2) {
            addCriterion("cd between", value1, value2, "cd");
            return (Criteria) this;
        }

        public Criteria andCdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("cd not between", value1, value2, "cd");
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