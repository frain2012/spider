package com.frain.spider.model;

import java.util.ArrayList;
import java.util.List;

public class TMpConfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMpConfExample() {
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPageUrlIsNull() {
            addCriterion("page_url is null");
            return (Criteria) this;
        }

        public Criteria andPageUrlIsNotNull() {
            addCriterion("page_url is not null");
            return (Criteria) this;
        }

        public Criteria andPageUrlEqualTo(String value) {
            addCriterion("page_url =", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotEqualTo(String value) {
            addCriterion("page_url <>", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlGreaterThan(String value) {
            addCriterion("page_url >", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("page_url >=", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLessThan(String value) {
            addCriterion("page_url <", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLessThanOrEqualTo(String value) {
            addCriterion("page_url <=", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlLike(String value) {
            addCriterion("page_url like", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotLike(String value) {
            addCriterion("page_url not like", value, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlIn(List<String> values) {
            addCriterion("page_url in", values, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotIn(List<String> values) {
            addCriterion("page_url not in", values, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlBetween(String value1, String value2) {
            addCriterion("page_url between", value1, value2, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andPageUrlNotBetween(String value1, String value2) {
            addCriterion("page_url not between", value1, value2, "pageUrl");
            return (Criteria) this;
        }

        public Criteria andMainConditionIsNull() {
            addCriterion("main_condition is null");
            return (Criteria) this;
        }

        public Criteria andMainConditionIsNotNull() {
            addCriterion("main_condition is not null");
            return (Criteria) this;
        }

        public Criteria andMainConditionEqualTo(String value) {
            addCriterion("main_condition =", value, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionNotEqualTo(String value) {
            addCriterion("main_condition <>", value, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionGreaterThan(String value) {
            addCriterion("main_condition >", value, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionGreaterThanOrEqualTo(String value) {
            addCriterion("main_condition >=", value, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionLessThan(String value) {
            addCriterion("main_condition <", value, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionLessThanOrEqualTo(String value) {
            addCriterion("main_condition <=", value, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionLike(String value) {
            addCriterion("main_condition like", value, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionNotLike(String value) {
            addCriterion("main_condition not like", value, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionIn(List<String> values) {
            addCriterion("main_condition in", values, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionNotIn(List<String> values) {
            addCriterion("main_condition not in", values, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionBetween(String value1, String value2) {
            addCriterion("main_condition between", value1, value2, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andMainConditionNotBetween(String value1, String value2) {
            addCriterion("main_condition not between", value1, value2, "mainCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionIsNull() {
            addCriterion("detail_condition is null");
            return (Criteria) this;
        }

        public Criteria andDetailConditionIsNotNull() {
            addCriterion("detail_condition is not null");
            return (Criteria) this;
        }

        public Criteria andDetailConditionEqualTo(String value) {
            addCriterion("detail_condition =", value, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionNotEqualTo(String value) {
            addCriterion("detail_condition <>", value, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionGreaterThan(String value) {
            addCriterion("detail_condition >", value, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionGreaterThanOrEqualTo(String value) {
            addCriterion("detail_condition >=", value, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionLessThan(String value) {
            addCriterion("detail_condition <", value, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionLessThanOrEqualTo(String value) {
            addCriterion("detail_condition <=", value, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionLike(String value) {
            addCriterion("detail_condition like", value, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionNotLike(String value) {
            addCriterion("detail_condition not like", value, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionIn(List<String> values) {
            addCriterion("detail_condition in", values, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionNotIn(List<String> values) {
            addCriterion("detail_condition not in", values, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionBetween(String value1, String value2) {
            addCriterion("detail_condition between", value1, value2, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andDetailConditionNotBetween(String value1, String value2) {
            addCriterion("detail_condition not between", value1, value2, "detailCondition");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Byte value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Byte value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Byte value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Byte value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Byte value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Byte> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Byte> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Byte value1, Byte value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andCronIsNull() {
            addCriterion("cron is null");
            return (Criteria) this;
        }

        public Criteria andCronIsNotNull() {
            addCriterion("cron is not null");
            return (Criteria) this;
        }

        public Criteria andCronEqualTo(String value) {
            addCriterion("cron =", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotEqualTo(String value) {
            addCriterion("cron <>", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThan(String value) {
            addCriterion("cron >", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronGreaterThanOrEqualTo(String value) {
            addCriterion("cron >=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThan(String value) {
            addCriterion("cron <", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLessThanOrEqualTo(String value) {
            addCriterion("cron <=", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronLike(String value) {
            addCriterion("cron like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotLike(String value) {
            addCriterion("cron not like", value, "cron");
            return (Criteria) this;
        }

        public Criteria andCronIn(List<String> values) {
            addCriterion("cron in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotIn(List<String> values) {
            addCriterion("cron not in", values, "cron");
            return (Criteria) this;
        }

        public Criteria andCronBetween(String value1, String value2) {
            addCriterion("cron between", value1, value2, "cron");
            return (Criteria) this;
        }

        public Criteria andCronNotBetween(String value1, String value2) {
            addCriterion("cron not between", value1, value2, "cron");
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