package com.atividadejpa.services;


import com.atividadejpa.entities.Aluno;
import com.atividadejpa.utils.Factory;
import javax.persistence.EntityManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author moaci
 */
public class AlunoServices {

    private final EntityManager em = Factory.manager;

    public Aluno getAlunoById(Long id) {
        try {
            em.getTransaction().begin();
            Aluno aluno = em.find(Aluno.class, id);
            em.getTransaction().commit();
            em.close();
            return aluno;
        } catch (Error e) {
            throw new Error(e.getMessage());
        }
    }
    
    public void insertAluno(Aluno aluno) {
        try {
            em.getTransaction().begin();
            em.persist(aluno);
            em.getTransaction().commit();
            em.close();
        } catch (Error e) {
            throw new Error(e.getMessage());
        }
    }
    
    public Aluno updateNomeAluno(Long id, String nome) {
        try {
            em.getTransaction().begin();
            Aluno aluno = em.find(Aluno.class, id);
            aluno.setNome(nome);
            em.getTransaction().commit();
            em.close();
            return aluno;
        } catch (Error e) {
            throw new Error(e.getMessage());
        }
    }
    
    public void deleteAluno(Long id) {
        try {
            em.getTransaction().begin();
            Aluno aluno = em.find(Aluno.class, id);
            em.remove(aluno);
            em.getTransaction().commit();
            em.close();
        } catch (Error e) {
            throw new Error(e.getMessage());
        }
    }
}
