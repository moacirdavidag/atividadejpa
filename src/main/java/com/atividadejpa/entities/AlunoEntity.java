/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividadejpa.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author moaci
 */
@Entity
@Table(name="tb_alunos")
public class AlunoEntity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private String nome;
    @NotNull
    private String matricula;
    @NotNull String email;
    
    @ManyToOne
    private OrientadorEntity orientador;

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

    public OrientadorEntity getOrientador() {
        return orientador;
    }

    public void setOrientador(OrientadorEntity orientador) {
        this.orientador = orientador;
    }

    
    @Override
    public String toString() {
        return "AlunoEntity{" + "id=" + id + ", nome=" + nome + ", matricula=" + matricula + ", email=" + email + '}';
    }
    
}
