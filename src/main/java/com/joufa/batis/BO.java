/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joufa.batis;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

/**
 *
 * @author joufa
 */
public class BO {
    public List<ClassVO> getAll() throws Exception{
        List<ClassVO> classes = null;
        try (SqlSession session = Factory.getSession().openSession()) {
            session.getConfiguration().addMapper(DAO.class);

            DAO dao = (DAO) session.getMapper(DAO.class);
            classes = dao.getAll();
        }
        return classes;

    }
    
    public static void main(String args[]) throws Exception {
        BO bo = new BO();
        ClassVO classvo = new ClassVO();
        
        List kikka = bo.getAll();
        
        System.out.println(kikka.get(0).toString());
        
    }

}
