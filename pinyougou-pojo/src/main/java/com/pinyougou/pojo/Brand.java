package com.pinyougou.pojo;


import java.io.Serializable;

/**
 * 品牌管理实体类
 */
public class Brand implements Serializable {

    private int id;
    private String name;
    private String firstChar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstChar() {
        return firstChar;
    }

    public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
    }
}
