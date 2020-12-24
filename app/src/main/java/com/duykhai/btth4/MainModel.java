package com.duykhai.btth4;

public class MainModel {

    Integer langLogo;
    String langName,langGia;

    public  MainModel (Integer langLogo, String langName, String langGia){
        this.langLogo = langLogo;
        this.langName = langName;
        this.langGia = langGia;
    }

    public Integer getLangLogo(){
        return langLogo;
    }

    public  String getLangName(){
        return  langName;
    }

    public  String getLangGia(){
        return  langGia;
    }

}

