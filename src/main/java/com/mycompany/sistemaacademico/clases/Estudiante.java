/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.clases;

/**
 *
 * @author IDC
 */
public class Estudiante  extends PersonaInstitucional {
    //ATRIBUTOS
    private int codigo;
    
    // CONSTRUCTOR

    public Estudiante(int codigo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.codigo = codigo;
    }
    //SET Y GET

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String agregarEstudiantes(){
        return "";
    }

    @Override
    public String toString() {
        return "Estudiante{" + super.toString()+"codigo=" + codigo + '}';
    }
    
    
}
