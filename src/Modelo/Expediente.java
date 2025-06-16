/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class Expediente {
    private int identificador; 
    private int prioridad;
    private String asunto;
    private Interesado_Persona Datos;
    private String documentoReferencia;
    private int estado;

    public Expediente() {
        this.identificador = 0000;
        this.prioridad = 0;
        this.asunto = null;
        this.Datos = null;
        this.documentoReferencia = null;
        this.estado = 0;
    }
    
    
}
