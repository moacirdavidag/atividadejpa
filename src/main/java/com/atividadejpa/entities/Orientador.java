/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividadejpa.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author moaci
 * @author raszz (from original branch)
 */
@Entity
@Table(name = "orientador_tb")
public class Orientador implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private String nome;
    @NotNull
    private String matricula;
    @NotNull
    private String email;
    
    @OneToMany(mappedBy = "orientador", fetch = FetchType.EAGER)
    private List<Aluno> orientandos = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Aluno> getOrientandos() {
        return orientandos;
    }

    @Override
    public String toString() {
        return "OrientadorEntity{" + "id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", email=" + email + ", orientandos=" + orientandos + '}';
    }
    
  
}
