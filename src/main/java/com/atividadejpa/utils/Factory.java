/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividadejpa.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author moaci
 */
public class Factory {
    
    public static EntityManagerFactory factory = Persistence.createEntityManagerFactory("my_persistence_unit");
    public static EntityManager manager = factory.createEntityManager();
    
}
