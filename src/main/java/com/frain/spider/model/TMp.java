package com.frain.spider.model;

import java.util.Date;

public class TMp {
    private Integer id;

    private String link;

    private String title;

    private String mark;

    private Date createtime;

    private String label;

    private String mpName;

    private String mpHistory;

    private String images;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public String getMpName() {
        return mpName;
    }

    public void setMpName(String mpName) {
        this.mpName = mpName == null ? null : mpName.trim();
    }

    public String getMpHistory() {
        return mpHistory;
    }

    public void setMpHistory(String mpHistory) {
        this.mpHistory = mpHistory == null ? null : mpHistory.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}