/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author piero
 */
public class Prenda {
    
    
    
    private String color;
    private String marca;
    private String precio;
    private String stock;
    private String ropa;

     public Prenda(){}

    public Prenda(String color, String marca, String precio) {
        this.color = color;
        this.marca = marca;
        this.precio = precio;
    }

    public Prenda(String stock, String ropa) {
        this.stock = stock;
        this.ropa = ropa;
    }

    
    
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getRopa() {
        return ropa;
    }

    public void setRopa(String ropa) {
        this.ropa = ropa;
    }

public String getTexto() {
    if ("0".equals(this.stock)) {
        return (this.ropa + " " 
                + this.color + " | " 
                + "S/." + this.precio + " | " 
                + "no hay stock");
    } else {
        return (this.ropa + " " 
                + this.color + " | " 
                + "S/." + this.precio + " | " 
                + this.marca + " | " + this.stock + " en stock");
    }
    
}
}