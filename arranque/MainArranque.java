
public class MainArranque {
    public static void main(String[] args) {
        // Producto precargados.
        Producto mouse = new Producto("Mouse", 300, "Accesorios", 10);
        Producto laptop = new Producto("Laptop", 15000, "Electrónica", 5);

        // Cliente precargado.
        Cliente elias = new Cliente("Elías Alejandro", "elias@ejemplo.com");

        // Se realiza una venta.
        Venta venta1 = new Venta(elias);

        //compra dos productos.
        venta1.agregarProducto(laptop, 1);
        venta1.agregarProducto(mouse, 2);

        //Calcular subtotales, podrían ser varias ventas.
        venta1.procesarVenta();

        //Se muestra la venta con los datos del cliente.
        System.out.println("Venta realizada a: " + venta1.getCliente().getNombre() + ", con correo: " + venta1.getCliente().getCorreo());
        //Se muestan los datos del cliente desde la venta en lugar del objeto cliente directamente, siento que es más correcto. 

        //Iteramos cobre los productos comprados en la venta. Intenté usar "in" en lugar de los : pero marcó error, supongo que me confundí con Python.
       /*  for (var producto : venta1.getItems()) {
            System.out.println(producto.getProducto().getNombre()+"x" + producto.getCantidad() + " = $" + producto.calcularSubtotal()+"\n");
        } */
        
        //Decidí mejor implementar el metodo de sacar subtotales en Venta.
        venta1.imprimirSubtotales();
        //imprimir total
        System.out.println("\nTotal: $" + String.format("%.2f", venta1.getTotal()));

        //Solo para saber sí hace la función de reducir stock.
        System.out.println("\nStock restante de"+ laptop.getNombre()+": " + laptop.getStock());
        System.out.println("Stock restante de"+ mouse.getNombre()+": " + mouse.getStock());
        
    }

}
