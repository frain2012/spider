package com.frain.spider.model;

public class TSpider {
    private Integer id;

    private Integer type;

    private String link;

    private String slink;

    private Byte stype;

    private Byte tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getSlink() {
        return slink;
    }

    public void setSlink(String slink) {
        this.slink = slink == null ? null : slink.trim();
    }

    public Byte getStype() {
        return stype;
    }

    public void setStype(Byte stype) {
        this.stype = stype;
    }

    public Byte getTag() {
        return tag;
    }

    public void setTag(Byte tag) {
        this.tag = tag;
    }
}