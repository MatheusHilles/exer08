/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exe;

import java.util.ArrayList;

/**
 *
 * @author mathillesheim
 */
public class Turma {
    
    private String disciplina;
    private Professor professor;
    private Turno turno;

    private ArrayList<Aluno> alunos = new ArrayList();
    
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public ArrayList<Aluno> getAluno() {
        return alunos;
    }
     
    public void incluirAluno(Aluno aluno) {
        
        alunos.add(aluno);
        
    }
    
    public void removerAluno(Aluno aluno) {
        
        alunos.remove(aluno);
        
    }
    
    public Aluno obterAlunoMelhorNotaEnem() {
        
        double maiorNota = 0;
        Aluno alunoMaiorNota = new Aluno();
        
        for(Aluno aluno : alunos) {
            
            if ( aluno.getNotaEnem() > maiorNota) {
                alunoMaiorNota = aluno;
                maiorNota = aluno.getNotaEnem();
                
            }
            
        }
         return alunoMaiorNota;
    }
    
}
