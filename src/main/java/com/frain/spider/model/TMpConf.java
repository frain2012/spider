package com.frain.spider.model;

public class TMpConf {
    private Long id;

    private String url;

    private String pageUrl;

    private String mainCondition;

    private String detailCondition;

    private Byte type;

    private String label;

    private String cron;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl == null ? null : pageUrl.trim();
    }

    public String getMainCondition() {
        return mainCondition;
    }

    public void setMainCondition(String mainCondition) {
        this.mainCondition = mainCondition == null ? null : mainCondition.trim();
    }

    public String getDetailCondition() {
        return detailCondition;
    }

    public void setDetailCondition(String detailCondition) {
        this.detailCondition = detailCondition == null ? null : detailCondition.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }
}