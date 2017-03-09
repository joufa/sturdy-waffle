/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joufa.batis;

/**
 *
 * @author joufa
 */
public class ClassVO {
    private int id;
    private String class_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    @Override
    public String toString() {
        return "ClassVO{" + "id=" + id + ", class_name=" + class_name + '}';
    }
    
    
    
}
