/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRUTAS;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Fruta {
    private String nombre, color;
    private int precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Fruta(String nombre, String color, int precio) {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }
    
    void leer(){
        Scanner read=new Scanner(System.in);
        System.out.println("==============");
        System.out.println("Nombre: ");
        String n=read.nextLine();
        System.out.println("Color: ");
        String c=read.nextLine();
        System.out.println("Precio: ");
        String p=read.nextLine();
        System.out.println("==============");
    }
    
}
