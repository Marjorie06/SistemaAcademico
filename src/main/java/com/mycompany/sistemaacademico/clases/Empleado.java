/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico.clases;

/**
 *
 * @author IDC
 */
public class Empleado extends PersonaInstitucional {

    //ATRIBUTO
    private double sueldo;

    //CONSTRUCTOR
    public Empleado(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.sueldo = sueldo;
    }
    //SET Y GET

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String agregarEmpleado() {
        return "";
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + "sueldo=" + sueldo + '}';
    }

}
