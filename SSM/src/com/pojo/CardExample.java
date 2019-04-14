package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CardExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andCardnameIsNull() {
            addCriterion("CardName is null");
            return (Criteria) this;
        }

        public Criteria andCardnameIsNotNull() {
            addCriterion("CardName is not null");
            return (Criteria) this;
        }

        public Criteria andCardnameEqualTo(String value) {
            addCriterion("CardName =", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotEqualTo(String value) {
            addCriterion("CardName <>", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameGreaterThan(String value) {
            addCriterion("CardName >", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameGreaterThanOrEqualTo(String value) {
            addCriterion("CardName >=", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLessThan(String value) {
            addCriterion("CardName <", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLessThanOrEqualTo(String value) {
            addCriterion("CardName <=", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameLike(String value) {
            addCriterion("CardName like", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotLike(String value) {
            addCriterion("CardName not like", value, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameIn(List<String> values) {
            addCriterion("CardName in", values, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotIn(List<String> values) {
            addCriterion("CardName not in", values, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameBetween(String value1, String value2) {
            addCriterion("CardName between", value1, value2, "cardname");
            return (Criteria) this;
        }

        public Criteria andCardnameNotBetween(String value1, String value2) {
            addCriterion("CardName not between", value1, value2, "cardname");
            return (Criteria) this;
        }

        public Criteria andBorrownumberIsNull() {
            addCriterion("BorrowNumber is null");
            return (Criteria) this;
        }

        public Criteria andBorrownumberIsNotNull() {
            addCriterion("BorrowNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBorrownumberEqualTo(Integer value) {
            addCriterion("BorrowNumber =", value, "borrownumber");
            return (Criteria) this;
        }

        public Criteria andBorrownumberNotEqualTo(Integer value) {
            addCriterion("BorrowNumber <>", value, "borrownumber");
            return (Criteria) this;
        }

        public Criteria andBorrownumberGreaterThan(Integer value) {
            addCriterion("BorrowNumber >", value, "borrownumber");
            return (Criteria) this;
        }

        public Criteria andBorrownumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("BorrowNumber >=", value, "borrownumber");
            return (Criteria) this;
        }

        public Criteria andBorrownumberLessThan(Integer value) {
            addCriterion("BorrowNumber <", value, "borrownumber");
            return (Criteria) this;
        }

        public Criteria andBorrownumberLessThanOrEqualTo(Integer value) {
            addCriterion("BorrowNumber <=", value, "borrownumber");
            return (Criteria) this;
        }

        public Criteria andBorrownumberIn(List<Integer> values) {
            addCriterion("BorrowNumber in", values, "borrownumber");
            return (Criteria) this;
        }

        public Criteria andBorrownumberNotIn(List<Integer> values) {
            addCriterion("BorrowNumber not in", values, "borrownumber");
            return (Criteria) this;
        }

        public Criteria andBorrownumberBetween(Integer value1, Integer value2) {
            addCriterion("BorrowNumber between", value1, value2, "borrownumber");
            return (Criteria) this;
        }

        public Criteria andBorrownumberNotBetween(Integer value1, Integer value2) {
            addCriterion("BorrowNumber not between", value1, value2, "borrownumber");
            return (Criteria) this;
        }

        public Criteria andAdateIsNull() {
            addCriterion("Adate is null");
            return (Criteria) this;
        }

        public Criteria andAdateIsNotNull() {
            addCriterion("Adate is not null");
            return (Criteria) this;
        }

        public Criteria andAdateEqualTo(Date value) {
            addCriterionForJDBCDate("Adate =", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Adate <>", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThan(Date value) {
            addCriterionForJDBCDate("Adate >", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Adate >=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThan(Date value) {
            addCriterionForJDBCDate("Adate <", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Adate <=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateIn(List<Date> values) {
            addCriterionForJDBCDate("Adate in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Adate not in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Adate between", value1, value2, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Adate not between", value1, value2, "adate");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("Mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("Mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("Mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("Mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("Mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("Mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("Mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("Mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("Mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("Mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("Mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("Mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("Mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("Mail not between", value1, value2, "mail");
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