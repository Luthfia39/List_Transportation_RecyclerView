package com.example.listoftransportationrecyclerview;

public class Transportation {
    String type;
    String desc;
    String link;

    public Transportation(String type, String desc, String link) {
        this.setType(type);
        this.setDesc(desc);
        this.setLink(link);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLink() { return link; }

    public void setLink(String link) { this.link = link; }
}
