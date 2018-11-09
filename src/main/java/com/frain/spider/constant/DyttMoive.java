package com.frain.spider.constant;

public enum  DyttMoive {
    NAME("译　　名","fname"),
    NAME2("片　　名","gname"),
    YEAR("年　　代","year"),
    AREA("产　　地","area"),
    SUBTYPE("类　　别","gtype"),
    LANG("语　　言","lang"),
    CAPTION("字　　幕","word"),
    DAY("上映日期","start"),
    IMDB("IMDb评分","icomment"),
    DOUB("豆瓣评分","dcomment"),
    VIDEO("视频尺寸","size"),
    TIME("片　　长","time"),
    DIRECTOR("导　　演","director"),
    DIO("编　　剧","writer"),
    STARING("主　　演","staring"),
    INTRODUCE("简　　介","introduce"),
    AWARDS ("获奖情况","awards"),

    ;
    private String name;
    private String value;
    private DyttMoive(String name,String value){
        this.name = name;
        this.value = value;
    }

    public static DyttMoive getContent(final String code){
        for (DyttMoive dyttMoive:DyttMoive.values()){
            if (code.indexOf(dyttMoive.getName())>-1){
                return dyttMoive;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
