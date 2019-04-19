package com.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LightExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLightTypeIsNull() {
            addCriterion("light_type is null");
            return (Criteria) this;
        }

        public Criteria andLightTypeIsNotNull() {
            addCriterion("light_type is not null");
            return (Criteria) this;
        }

        public Criteria andLightTypeEqualTo(Integer value) {
            addCriterion("light_type =", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeNotEqualTo(Integer value) {
            addCriterion("light_type <>", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeGreaterThan(Integer value) {
            addCriterion("light_type >", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("light_type >=", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeLessThan(Integer value) {
            addCriterion("light_type <", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeLessThanOrEqualTo(Integer value) {
            addCriterion("light_type <=", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeIn(List<Integer> values) {
            addCriterion("light_type in", values, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeNotIn(List<Integer> values) {
            addCriterion("light_type not in", values, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeBetween(Integer value1, Integer value2) {
            addCriterion("light_type between", value1, value2, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("light_type not between", value1, value2, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightBrandIsNull() {
            addCriterion("light_brand is null");
            return (Criteria) this;
        }

        public Criteria andLightBrandIsNotNull() {
            addCriterion("light_brand is not null");
            return (Criteria) this;
        }

        public Criteria andLightBrandEqualTo(Integer value) {
            addCriterion("light_brand =", value, "lightBrand");
            return (Criteria) this;
        }

        public Criteria andLightBrandNotEqualTo(Integer value) {
            addCriterion("light_brand <>", value, "lightBrand");
            return (Criteria) this;
        }

        public Criteria andLightBrandGreaterThan(Integer value) {
            addCriterion("light_brand >", value, "lightBrand");
            return (Criteria) this;
        }

        public Criteria andLightBrandGreaterThanOrEqualTo(Integer value) {
            addCriterion("light_brand >=", value, "lightBrand");
            return (Criteria) this;
        }

        public Criteria andLightBrandLessThan(Integer value) {
            addCriterion("light_brand <", value, "lightBrand");
            return (Criteria) this;
        }

        public Criteria andLightBrandLessThanOrEqualTo(Integer value) {
            addCriterion("light_brand <=", value, "lightBrand");
            return (Criteria) this;
        }

        public Criteria andLightBrandIn(List<Integer> values) {
            addCriterion("light_brand in", values, "lightBrand");
            return (Criteria) this;
        }

        public Criteria andLightBrandNotIn(List<Integer> values) {
            addCriterion("light_brand not in", values, "lightBrand");
            return (Criteria) this;
        }

        public Criteria andLightBrandBetween(Integer value1, Integer value2) {
            addCriterion("light_brand between", value1, value2, "lightBrand");
            return (Criteria) this;
        }

        public Criteria andLightBrandNotBetween(Integer value1, Integer value2) {
            addCriterion("light_brand not between", value1, value2, "lightBrand");
            return (Criteria) this;
        }

        public Criteria andLightStyleIsNull() {
            addCriterion("light_style is null");
            return (Criteria) this;
        }

        public Criteria andLightStyleIsNotNull() {
            addCriterion("light_style is not null");
            return (Criteria) this;
        }

        public Criteria andLightStyleEqualTo(Integer value) {
            addCriterion("light_style =", value, "lightStyle");
            return (Criteria) this;
        }

        public Criteria andLightStyleNotEqualTo(Integer value) {
            addCriterion("light_style <>", value, "lightStyle");
            return (Criteria) this;
        }

        public Criteria andLightStyleGreaterThan(Integer value) {
            addCriterion("light_style >", value, "lightStyle");
            return (Criteria) this;
        }

        public Criteria andLightStyleGreaterThanOrEqualTo(Integer value) {
            addCriterion("light_style >=", value, "lightStyle");
            return (Criteria) this;
        }

        public Criteria andLightStyleLessThan(Integer value) {
            addCriterion("light_style <", value, "lightStyle");
            return (Criteria) this;
        }

        public Criteria andLightStyleLessThanOrEqualTo(Integer value) {
            addCriterion("light_style <=", value, "lightStyle");
            return (Criteria) this;
        }

        public Criteria andLightStyleIn(List<Integer> values) {
            addCriterion("light_style in", values, "lightStyle");
            return (Criteria) this;
        }

        public Criteria andLightStyleNotIn(List<Integer> values) {
            addCriterion("light_style not in", values, "lightStyle");
            return (Criteria) this;
        }

        public Criteria andLightStyleBetween(Integer value1, Integer value2) {
            addCriterion("light_style between", value1, value2, "lightStyle");
            return (Criteria) this;
        }

        public Criteria andLightStyleNotBetween(Integer value1, Integer value2) {
            addCriterion("light_style not between", value1, value2, "lightStyle");
            return (Criteria) this;
        }

        public Criteria andLightStuffIsNull() {
            addCriterion("light_stuff is null");
            return (Criteria) this;
        }

        public Criteria andLightStuffIsNotNull() {
            addCriterion("light_stuff is not null");
            return (Criteria) this;
        }

        public Criteria andLightStuffEqualTo(Integer value) {
            addCriterion("light_stuff =", value, "lightStuff");
            return (Criteria) this;
        }

        public Criteria andLightStuffNotEqualTo(Integer value) {
            addCriterion("light_stuff <>", value, "lightStuff");
            return (Criteria) this;
        }

        public Criteria andLightStuffGreaterThan(Integer value) {
            addCriterion("light_stuff >", value, "lightStuff");
            return (Criteria) this;
        }

        public Criteria andLightStuffGreaterThanOrEqualTo(Integer value) {
            addCriterion("light_stuff >=", value, "lightStuff");
            return (Criteria) this;
        }

        public Criteria andLightStuffLessThan(Integer value) {
            addCriterion("light_stuff <", value, "lightStuff");
            return (Criteria) this;
        }

        public Criteria andLightStuffLessThanOrEqualTo(Integer value) {
            addCriterion("light_stuff <=", value, "lightStuff");
            return (Criteria) this;
        }

        public Criteria andLightStuffIn(List<Integer> values) {
            addCriterion("light_stuff in", values, "lightStuff");
            return (Criteria) this;
        }

        public Criteria andLightStuffNotIn(List<Integer> values) {
            addCriterion("light_stuff not in", values, "lightStuff");
            return (Criteria) this;
        }

        public Criteria andLightStuffBetween(Integer value1, Integer value2) {
            addCriterion("light_stuff between", value1, value2, "lightStuff");
            return (Criteria) this;
        }

        public Criteria andLightStuffNotBetween(Integer value1, Integer value2) {
            addCriterion("light_stuff not between", value1, value2, "lightStuff");
            return (Criteria) this;
        }

        public Criteria andLightColorIsNull() {
            addCriterion("light_color is null");
            return (Criteria) this;
        }

        public Criteria andLightColorIsNotNull() {
            addCriterion("light_color is not null");
            return (Criteria) this;
        }

        public Criteria andLightColorEqualTo(String value) {
            addCriterion("light_color =", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorNotEqualTo(String value) {
            addCriterion("light_color <>", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorGreaterThan(String value) {
            addCriterion("light_color >", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorGreaterThanOrEqualTo(String value) {
            addCriterion("light_color >=", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorLessThan(String value) {
            addCriterion("light_color <", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorLessThanOrEqualTo(String value) {
            addCriterion("light_color <=", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorLike(String value) {
            addCriterion("light_color like", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorNotLike(String value) {
            addCriterion("light_color not like", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorIn(List<String> values) {
            addCriterion("light_color in", values, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorNotIn(List<String> values) {
            addCriterion("light_color not in", values, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorBetween(String value1, String value2) {
            addCriterion("light_color between", value1, value2, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorNotBetween(String value1, String value2) {
            addCriterion("light_color not between", value1, value2, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightLocateIsNull() {
            addCriterion("light_locate is null");
            return (Criteria) this;
        }

        public Criteria andLightLocateIsNotNull() {
            addCriterion("light_locate is not null");
            return (Criteria) this;
        }

        public Criteria andLightLocateEqualTo(Integer value) {
            addCriterion("light_locate =", value, "lightLocate");
            return (Criteria) this;
        }

        public Criteria andLightLocateNotEqualTo(Integer value) {
            addCriterion("light_locate <>", value, "lightLocate");
            return (Criteria) this;
        }

        public Criteria andLightLocateGreaterThan(Integer value) {
            addCriterion("light_locate >", value, "lightLocate");
            return (Criteria) this;
        }

        public Criteria andLightLocateGreaterThanOrEqualTo(Integer value) {
            addCriterion("light_locate >=", value, "lightLocate");
            return (Criteria) this;
        }

        public Criteria andLightLocateLessThan(Integer value) {
            addCriterion("light_locate <", value, "lightLocate");
            return (Criteria) this;
        }

        public Criteria andLightLocateLessThanOrEqualTo(Integer value) {
            addCriterion("light_locate <=", value, "lightLocate");
            return (Criteria) this;
        }

        public Criteria andLightLocateIn(List<Integer> values) {
            addCriterion("light_locate in", values, "lightLocate");
            return (Criteria) this;
        }

        public Criteria andLightLocateNotIn(List<Integer> values) {
            addCriterion("light_locate not in", values, "lightLocate");
            return (Criteria) this;
        }

        public Criteria andLightLocateBetween(Integer value1, Integer value2) {
            addCriterion("light_locate between", value1, value2, "lightLocate");
            return (Criteria) this;
        }

        public Criteria andLightLocateNotBetween(Integer value1, Integer value2) {
            addCriterion("light_locate not between", value1, value2, "lightLocate");
            return (Criteria) this;
        }

        public Criteria andLightPriceIsNull() {
            addCriterion("light_price is null");
            return (Criteria) this;
        }

        public Criteria andLightPriceIsNotNull() {
            addCriterion("light_price is not null");
            return (Criteria) this;
        }

        public Criteria andLightPriceEqualTo(Double value) {
            addCriterion("light_price =", value, "lightPrice");
            return (Criteria) this;
        }

        public Criteria andLightPriceNotEqualTo(Double value) {
            addCriterion("light_price <>", value, "lightPrice");
            return (Criteria) this;
        }

        public Criteria andLightPriceGreaterThan(Double value) {
            addCriterion("light_price >", value, "lightPrice");
            return (Criteria) this;
        }

        public Criteria andLightPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("light_price >=", value, "lightPrice");
            return (Criteria) this;
        }

        public Criteria andLightPriceLessThan(Double value) {
            addCriterion("light_price <", value, "lightPrice");
            return (Criteria) this;
        }

        public Criteria andLightPriceLessThanOrEqualTo(Double value) {
            addCriterion("light_price <=", value, "lightPrice");
            return (Criteria) this;
        }

        public Criteria andLightPriceIn(List<Double> values) {
            addCriterion("light_price in", values, "lightPrice");
            return (Criteria) this;
        }

        public Criteria andLightPriceNotIn(List<Double> values) {
            addCriterion("light_price not in", values, "lightPrice");
            return (Criteria) this;
        }

        public Criteria andLightPriceBetween(Double value1, Double value2) {
            addCriterion("light_price between", value1, value2, "lightPrice");
            return (Criteria) this;
        }

        public Criteria andLightPriceNotBetween(Double value1, Double value2) {
            addCriterion("light_price not between", value1, value2, "lightPrice");
            return (Criteria) this;
        }

        public Criteria andLightQuantityIsNull() {
            addCriterion("light_quantity is null");
            return (Criteria) this;
        }

        public Criteria andLightQuantityIsNotNull() {
            addCriterion("light_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andLightQuantityEqualTo(Integer value) {
            addCriterion("light_quantity =", value, "lightQuantity");
            return (Criteria) this;
        }

        public Criteria andLightQuantityNotEqualTo(Integer value) {
            addCriterion("light_quantity <>", value, "lightQuantity");
            return (Criteria) this;
        }

        public Criteria andLightQuantityGreaterThan(Integer value) {
            addCriterion("light_quantity >", value, "lightQuantity");
            return (Criteria) this;
        }

        public Criteria andLightQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("light_quantity >=", value, "lightQuantity");
            return (Criteria) this;
        }

        public Criteria andLightQuantityLessThan(Integer value) {
            addCriterion("light_quantity <", value, "lightQuantity");
            return (Criteria) this;
        }

        public Criteria andLightQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("light_quantity <=", value, "lightQuantity");
            return (Criteria) this;
        }

        public Criteria andLightQuantityIn(List<Integer> values) {
            addCriterion("light_quantity in", values, "lightQuantity");
            return (Criteria) this;
        }

        public Criteria andLightQuantityNotIn(List<Integer> values) {
            addCriterion("light_quantity not in", values, "lightQuantity");
            return (Criteria) this;
        }

        public Criteria andLightQuantityBetween(Integer value1, Integer value2) {
            addCriterion("light_quantity between", value1, value2, "lightQuantity");
            return (Criteria) this;
        }

        public Criteria andLightQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("light_quantity not between", value1, value2, "lightQuantity");
            return (Criteria) this;
        }

        public Criteria andLightDescriptIsNull() {
            addCriterion("light_descript is null");
            return (Criteria) this;
        }

        public Criteria andLightDescriptIsNotNull() {
            addCriterion("light_descript is not null");
            return (Criteria) this;
        }

        public Criteria andLightDescriptEqualTo(String value) {
            addCriterion("light_descript =", value, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptNotEqualTo(String value) {
            addCriterion("light_descript <>", value, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptGreaterThan(String value) {
            addCriterion("light_descript >", value, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("light_descript >=", value, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptLessThan(String value) {
            addCriterion("light_descript <", value, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptLessThanOrEqualTo(String value) {
            addCriterion("light_descript <=", value, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptLike(String value) {
            addCriterion("light_descript like", value, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptNotLike(String value) {
            addCriterion("light_descript not like", value, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptIn(List<String> values) {
            addCriterion("light_descript in", values, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptNotIn(List<String> values) {
            addCriterion("light_descript not in", values, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptBetween(String value1, String value2) {
            addCriterion("light_descript between", value1, value2, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightDescriptNotBetween(String value1, String value2) {
            addCriterion("light_descript not between", value1, value2, "lightDescript");
            return (Criteria) this;
        }

        public Criteria andLightImageIsNull() {
            addCriterion("light_image is null");
            return (Criteria) this;
        }

        public Criteria andLightImageIsNotNull() {
            addCriterion("light_image is not null");
            return (Criteria) this;
        }

        public Criteria andLightImageEqualTo(String value) {
            addCriterion("light_image =", value, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageNotEqualTo(String value) {
            addCriterion("light_image <>", value, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageGreaterThan(String value) {
            addCriterion("light_image >", value, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageGreaterThanOrEqualTo(String value) {
            addCriterion("light_image >=", value, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageLessThan(String value) {
            addCriterion("light_image <", value, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageLessThanOrEqualTo(String value) {
            addCriterion("light_image <=", value, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageLike(String value) {
            addCriterion("light_image like", value, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageNotLike(String value) {
            addCriterion("light_image not like", value, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageIn(List<String> values) {
            addCriterion("light_image in", values, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageNotIn(List<String> values) {
            addCriterion("light_image not in", values, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageBetween(String value1, String value2) {
            addCriterion("light_image between", value1, value2, "lightImage");
            return (Criteria) this;
        }

        public Criteria andLightImageNotBetween(String value1, String value2) {
            addCriterion("light_image not between", value1, value2, "lightImage");
            return (Criteria) this;
        }

        public Criteria andHasdeleteIsNull() {
            addCriterion("hasdelete is null");
            return (Criteria) this;
        }

        public Criteria andHasdeleteIsNotNull() {
            addCriterion("hasdelete is not null");
            return (Criteria) this;
        }

        public Criteria andHasdeleteEqualTo(Boolean value) {
            addCriterion("hasdelete =", value, "hasdelete");
            return (Criteria) this;
        }

        public Criteria andHasdeleteNotEqualTo(Boolean value) {
            addCriterion("hasdelete <>", value, "hasdelete");
            return (Criteria) this;
        }

        public Criteria andHasdeleteGreaterThan(Boolean value) {
            addCriterion("hasdelete >", value, "hasdelete");
            return (Criteria) this;
        }

        public Criteria andHasdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("hasdelete >=", value, "hasdelete");
            return (Criteria) this;
        }

        public Criteria andHasdeleteLessThan(Boolean value) {
            addCriterion("hasdelete <", value, "hasdelete");
            return (Criteria) this;
        }

        public Criteria andHasdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("hasdelete <=", value, "hasdelete");
            return (Criteria) this;
        }

        public Criteria andHasdeleteIn(List<Boolean> values) {
            addCriterion("hasdelete in", values, "hasdelete");
            return (Criteria) this;
        }

        public Criteria andHasdeleteNotIn(List<Boolean> values) {
            addCriterion("hasdelete not in", values, "hasdelete");
            return (Criteria) this;
        }

        public Criteria andHasdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("hasdelete between", value1, value2, "hasdelete");
            return (Criteria) this;
        }

        public Criteria andHasdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("hasdelete not between", value1, value2, "hasdelete");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
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