/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joufa.batis;

import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSessionFactory;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 *
 * @author joufa
 */
public class Factory {

    private static SqlSessionFactory sqlMapper;



    static {

        try {

     
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlMapper = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    public static SqlSessionFactory getSession() {

        return sqlMapper;

    }

}
