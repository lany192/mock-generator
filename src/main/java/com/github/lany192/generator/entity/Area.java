package com.github.lany192.generator.entity;

import java.util.List;

public class Area {
    private int id;
    private String name;
    private List<Area> subarea;

    public List<Area> getSubarea() {
        return subarea;
    }

    public void setSubarea(List<Area> subarea) {
        this.subarea = subarea;
    }

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
}
