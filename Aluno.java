/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exe;

/**
 *
 * @author mathillesheim
 */
public class Aluno {
    
    private int matricula;
    private String nome;
    private double notaEnem;
    
    public Aluno (int matricula, String nome, double notaEnem) {
        setMatricula(matricula);
        setNome(nome);
        setNotaEnem(notaEnem);
    }
    
    public Aluno () {
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(double notaEnem) {
        this.notaEnem = notaEnem;
    }
    
    
    
}
