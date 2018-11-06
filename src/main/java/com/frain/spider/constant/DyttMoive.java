package com.frain.spider.constant;

public enum  DyttMoive {
    NAME("译　　名","name"),
    NAME2("片　　名","name1"),
    YEAR("年　　代","name"),
    AREA("产　　地","name"),
    SUBTYPE("类　　别","name"),
    LANG("语　　言","lang"),
    CAPTION("字　　幕","name"),
    DAY("上映日期","name"),
    IMDB("IMDb评分","name"),
    DOUB("豆瓣评分","name"),
    VIDEO("视频尺寸","name"),
    TIME("片　　长","name"),
    DIRECTOR("导　　演","director"),
    DIO("编　　剧","name"),
    STARING("主　　演","staring"),
    INTRODUCE("简　　介","introduce"),
    AWARDS ("获奖情况","name"),

    ;
    private String name;
    private String value;
    private DyttMoive(String name,String value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
