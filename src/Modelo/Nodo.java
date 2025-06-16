/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

//convertimos a clase generica, reemplazar los parametros int a T.
public class Nodo<T>{
    
    private T item;
    private Nodo sgteNodo; //asumiendo q la clase nodo ya esta hecha
    
    //metodos
    //creacion de un nodo
    //constructores sin/con parametros
    
    public Nodo(){
        item = null;
        sgteNodo = null;
    }
    
    public Nodo(T item){
        this.item = item;
        sgteNodo = null;
    }
    
    public Nodo(T item, Nodo sgteNodo){
        this.item = item;
        this.sgteNodo = sgteNodo;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Nodo getSgteNodo() {
        return sgteNodo;
    }

    public void setSgteNodo(Nodo sgteNodo) {
        this.sgteNodo = sgteNodo;
    }
    
    
    
    
    
    
    
    
}
