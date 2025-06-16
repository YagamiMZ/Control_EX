/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author LENOVO
 */
public class ListaExpedientes {
    private ListaDE<Expediente> listaExpediente;

    public ListaExpedientes(ListaDE<Expediente> listaExpediente) {
        this.listaExpediente = listaExpediente;
    }
    
    public void registrarExpe(Expediente exped){
    listaExpediente.agregar(exped);
    }
}
