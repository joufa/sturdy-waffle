/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joufa.batis;

import java.util.List;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author joufa
 */
public interface DAO {
    final String GET_ALL = "select * from classes";
    
@Select(GET_ALL)
public List<ClassVO> getAll() throws Exception;
}
