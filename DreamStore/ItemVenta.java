

public class ItemVenta {
    private Producto producto;
    private int cantidad;

    public ItemVenta(Producto producto, int cantidad){
        if(producto.validarStock(cantidad) == false){
            System.out.println("No hay suficiente producto de " + producto.getNombre());
            this.producto = producto; //registro el producto aunque no haya stock para usarlo después en el ticket y avisar al usuario.
            this.cantidad = 0;
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
