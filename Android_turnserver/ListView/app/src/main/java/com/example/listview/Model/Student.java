package com.example.listview.Model;

public class Student {

    String urlImage;
    String name;
    String nameClass;

    public Student(String urlImage, String name, String nameClass) {
        this.urlImage = urlImage;
        this.name = name;
        this.nameClass = nameClass;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }
}
