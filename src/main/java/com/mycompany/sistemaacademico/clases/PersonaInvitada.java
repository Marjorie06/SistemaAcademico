/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.clases;

/**
 *
 * @author IDC
 */
public class PersonaInvitada extends Persona {

    public PersonaInvitada(int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
    }
    
    
   //CONSTRUCTOR
    public String agregarPersonaInvitada(){
        return "";
    
}

    @Override
    public String toString() {
        return "PersonaInvitada{" + '}'+super.toString();  //el toString utiliza los atributos de su padre para dar los valores 
    }
    
    
    
       
}
