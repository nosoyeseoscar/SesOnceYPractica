

public class ItemCuenta {
    private Producto producto;
    private int cantidad;

    public ItemCuenta(Producto producto, int cantidad){
        if(cantidad > producto.getStock()){
            System.out.println("No hay suficiente producto de " + producto.getNombre());
        }else{
            this.producto = producto;
            this.cantidad = cantidad;
            //Se reduce la cantidad en stock del producto al generarse el objeto ItemCuenta.
            producto.reducirStock(cantidad);
        }
    }

    public int getCantidad(){
        return cantidad;
    }

    public Producto getProducto(){
        return producto;
    }

    public double calcularSubtotal(){
        //Se calcula subtotal por producto.
        return producto.getPrecio() * cantidad;
    }
}
