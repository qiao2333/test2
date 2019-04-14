package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andBooknameIsNull() {
            addCriterion("BookName is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("BookName is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("BookName =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("BookName <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("BookName >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("BookName >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("BookName <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("BookName <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("BookName like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("BookName not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("BookName in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("BookName not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("BookName between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("BookName not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooksoftIsNull() {
            addCriterion("BookSoft is null");
            return (Criteria) this;
        }

        public Criteria andBooksoftIsNotNull() {
            addCriterion("BookSoft is not null");
            return (Criteria) this;
        }

        public Criteria andBooksoftEqualTo(String value) {
            addCriterion("BookSoft =", value, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftNotEqualTo(String value) {
            addCriterion("BookSoft <>", value, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftGreaterThan(String value) {
            addCriterion("BookSoft >", value, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftGreaterThanOrEqualTo(String value) {
            addCriterion("BookSoft >=", value, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftLessThan(String value) {
            addCriterion("BookSoft <", value, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftLessThanOrEqualTo(String value) {
            addCriterion("BookSoft <=", value, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftLike(String value) {
            addCriterion("BookSoft like", value, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftNotLike(String value) {
            addCriterion("BookSoft not like", value, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftIn(List<String> values) {
            addCriterion("BookSoft in", values, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftNotIn(List<String> values) {
            addCriterion("BookSoft not in", values, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftBetween(String value1, String value2) {
            addCriterion("BookSoft between", value1, value2, "booksoft");
            return (Criteria) this;
        }

        public Criteria andBooksoftNotBetween(String value1, String value2) {
            addCriterion("BookSoft not between", value1, value2, "booksoft");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("Author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("Author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("Author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("Author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("Author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("Author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("Author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("Author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("Author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("Author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("Author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("Author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("Author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("Author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPressIsNull() {
            addCriterion("Press is null");
            return (Criteria) this;
        }

        public Criteria andPressIsNotNull() {
            addCriterion("Press is not null");
            return (Criteria) this;
        }

        public Criteria andPressEqualTo(String value) {
            addCriterion("Press =", value, "press");
            return (Criteria) this;
        }

        public Criteria andPressNotEqualTo(String value) {
            addCriterion("Press <>", value, "press");
            return (Criteria) this;
        }

        public Criteria andPressGreaterThan(String value) {
            addCriterion("Press >", value, "press");
            return (Criteria) this;
        }

        public Criteria andPressGreaterThanOrEqualTo(String value) {
            addCriterion("Press >=", value, "press");
            return (Criteria) this;
        }

        public Criteria andPressLessThan(String value) {
            addCriterion("Press <", value, "press");
            return (Criteria) this;
        }

        public Criteria andPressLessThanOrEqualTo(String value) {
            addCriterion("Press <=", value, "press");
            return (Criteria) this;
        }

        public Criteria andPressLike(String value) {
            addCriterion("Press like", value, "press");
            return (Criteria) this;
        }

        public Criteria andPressNotLike(String value) {
            addCriterion("Press not like", value, "press");
            return (Criteria) this;
        }

        public Criteria andPressIn(List<String> values) {
            addCriterion("Press in", values, "press");
            return (Criteria) this;
        }

        public Criteria andPressNotIn(List<String> values) {
            addCriterion("Press not in", values, "press");
            return (Criteria) this;
        }

        public Criteria andPressBetween(String value1, String value2) {
            addCriterion("Press between", value1, value2, "press");
            return (Criteria) this;
        }

        public Criteria andPressNotBetween(String value1, String value2) {
            addCriterion("Press not between", value1, value2, "press");
            return (Criteria) this;
        }

        public Criteria andPdateIsNull() {
            addCriterion("Pdate is null");
            return (Criteria) this;
        }

        public Criteria andPdateIsNotNull() {
            addCriterion("Pdate is not null");
            return (Criteria) this;
        }

        public Criteria andPdateEqualTo(Date value) {
            addCriterionForJDBCDate("Pdate =", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("Pdate <>", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateGreaterThan(Date value) {
            addCriterionForJDBCDate("Pdate >", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pdate >=", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateLessThan(Date value) {
            addCriterionForJDBCDate("Pdate <", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Pdate <=", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateIn(List<Date> values) {
            addCriterionForJDBCDate("Pdate in", values, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("Pdate not in", values, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pdate between", value1, value2, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Pdate not between", value1, value2, "pdate");
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

        public Criteria andMaxnumberIsNull() {
            addCriterion("MaxNumber is null");
            return (Criteria) this;
        }

        public Criteria andMaxnumberIsNotNull() {
            addCriterion("MaxNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMaxnumberEqualTo(Integer value) {
            addCriterion("MaxNumber =", value, "maxnumber");
            return (Criteria) this;
        }

        public Criteria andMaxnumberNotEqualTo(Integer value) {
            addCriterion("MaxNumber <>", value, "maxnumber");
            return (Criteria) this;
        }

        public Criteria andMaxnumberGreaterThan(Integer value) {
            addCriterion("MaxNumber >", value, "maxnumber");
            return (Criteria) this;
        }

        public Criteria andMaxnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxNumber >=", value, "maxnumber");
            return (Criteria) this;
        }

        public Criteria andMaxnumberLessThan(Integer value) {
            addCriterion("MaxNumber <", value, "maxnumber");
            return (Criteria) this;
        }

        public Criteria andMaxnumberLessThanOrEqualTo(Integer value) {
            addCriterion("MaxNumber <=", value, "maxnumber");
            return (Criteria) this;
        }

        public Criteria andMaxnumberIn(List<Integer> values) {
            addCriterion("MaxNumber in", values, "maxnumber");
            return (Criteria) this;
        }

        public Criteria andMaxnumberNotIn(List<Integer> values) {
            addCriterion("MaxNumber not in", values, "maxnumber");
            return (Criteria) this;
        }

        public Criteria andMaxnumberBetween(Integer value1, Integer value2) {
            addCriterion("MaxNumber between", value1, value2, "maxnumber");
            return (Criteria) this;
        }

        public Criteria andMaxnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxNumber not between", value1, value2, "maxnumber");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("Number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("Number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("Number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("Number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("Number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("Number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("Number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("Number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("Number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("Number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("Number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("Number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("Price not between", value1, value2, "price");
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