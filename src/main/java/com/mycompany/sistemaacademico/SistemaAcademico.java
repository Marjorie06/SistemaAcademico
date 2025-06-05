/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistemaacademico;

import com.mycompany.sistemaacademico.clases.Empleado;
import com.mycompany.sistemaacademico.clases.Persona;
import com.mycompany.sistemaacademico.clases.PersonaInstitucional;
import com.mycompany.sistemaacademico.clases.PersonaInvitada;

/**
 *
 * @author IDC
 */
public class SistemaAcademico {

    public static void main(String[] args) {

        System.out.println("--DATOS DEL OBJETO PERSONA--");
        Persona persona = new Persona(1, "Marjorie", "marjorie@gmail.com", "2250160229");
        System.out.println("Datos de " + persona.toString());

        System.out.println("--DATOS DEL OBJETO PERSONA INVITADA--");
        PersonaInvitada personaInvitada = new PersonaInvitada(2, "Daniela", "Daniela@gmail.com", "1426178995");
        System.out.println("Datos de " + personaInvitada.toString());

        System.out.println("--DATOS DEL OBJETO DE LA PERSONA INSTITUCIONAL");
        PersonaInstitucional personalInstitucional =new PersonaInstitucional("marjorie@gmail.com", 3, "Marjorie", "marjorie.chimbo@espoch.edu.ec", "2216926898");
        System.out.println("Datos de "+personalInstitucional.toString());
        
        System.out.println("--DATOS DEL OBJETO EMPLEADO");
        Empleado empleado=new Empleado(470, "Andrea.Quiroga@espoch.edu.ec", 5, "Andrea", "andrea@gmail.com", "2257463986");
        System.out.println("Datos de "+empleado.toString());
    }
}
