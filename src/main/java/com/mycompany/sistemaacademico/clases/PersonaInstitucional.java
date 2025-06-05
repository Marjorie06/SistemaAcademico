/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.clases;

/**
 *
 * @author IDC
 */
public class PersonaInstitucional extends Persona {
    //ATRIBUTOS
    private String correoInstitucional;
    
    //CONSTRUCTOR

    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }

    //SET Y GET
    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }
    public String agregarPersonaInstitucional(){
        return "";
    }

    @Override
    public String toString() {     //Sirve para llamar a los atributos y el super y eso sirve para llamar a la clase padre
        return "PersonaInstitucional{" +super.toString()+  "correoInstitucional=" + correoInstitucional + '}';
    }
    
    
}
