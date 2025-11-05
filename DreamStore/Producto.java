

public class Producto {
    private String nombre;
    private double precio;
    //private String categoria;
    private int stock;

    public Producto(String nombre, double precio, String categoria, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        //this.categoria = categoria;
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void reducirStock(int cantidad){
        if (cantidad<=stock) {
            stock = stock - cantidad; //stock -= cantidad;
        }else{
            System.out.println("No hay suficiente producto de "+nombre);
        }
    }

}
