/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividadejpa.services;

import com.atividadejpa.entities.Empresa;
import com.atividadejpa.entities.Estagio;
import com.atividadejpa.utils.Factory;
import javax.persistence.EntityManager;

/**
 *
 * @author moaci
 */
public class EmpresaServices {
    
    EntityManager em = Factory.manager;
    
    public void insertEmpresa(Empresa empresa) {
        try {
            em.getTransaction().begin();
            
            em.persist(empresa);
            
            em.getTransaction().commit();
            em.close();
        } catch(Error e) {
            throw new Error(e.getMessage());
        }
    }
    
    public Empresa getEmpresaById(Long id) {
        try {
            em.getTransaction().begin();
            
            Empresa empresa = em.find(Empresa.class, id);
            
            em.getTransaction().commit();
            em.close();
            return empresa;
        } catch(Error e) {
            throw new Error(e.getMessage());
        }
    }
    
    public void deleteEmpresa(Long id) {
        try {
            em.getTransaction().begin();
            
            Empresa empresa = em.find(Empresa.class, id);
            em.remove(empresa);
            
            em.getTransaction().commit();
            em.close();
        } catch(Error e) {
            throw new Error(e.getMessage());
        }
    }
    
    public void adicionarEstagio(Long id, Estagio estagio) {
        try {
            em.getTransaction().begin();
            
            Empresa empresa = em.find(Empresa.class, id);
            empresa.getEstagios().add(estagio);
            
            em.getTransaction().commit();
            em.close();
        } catch(Error e) {
            throw new Error(e.getMessage());
        }
    }
    
    public void removerEstagio(Long id, Estagio estagio) {
        try {
            em.getTransaction().begin();
            
            Empresa empresa = em.find(Empresa.class, id);
            empresa.getEstagios().remove(estagio);
            
            em.getTransaction().commit();
            em.close();
        } catch(Error e) {
            throw new Error(e.getMessage());
        }
    }
    
}
