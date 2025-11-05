import java.util.ArrayList;

public class Venta {
    //private Producto producto;
    private Cliente cliente;
    private ArrayList<ItemCuenta> items;//productos y su cantidad
    private double total;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.items = new ArrayList<>();
        total = 0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        items.add(new ItemCuenta(producto, cantidad));
    }

    public void procesarVenta() {
        total = 0;
        for (ItemCuenta item : items) {
            total += item.calcularSubtotal();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    /* public ArrayList<ItemCuenta> getItems() {
        return items;
    }  */

    public void imprimirSubtotales(){
        System.out.println();
        for (ItemCuenta item : items) {
            System.out.println(item.getProducto().getNombre()+" x " + item.getCantidad() + " = $" + String.format("%.2f", item.calcularSubtotal()) );
            total = total + item.calcularSubtotal();
        }
    }

    public double getTotal(){
        return total;
    }
    
}
