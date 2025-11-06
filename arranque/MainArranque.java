
public class MainArranque {
    public static void main(String[] args) {
        // Producto precargados, que sería el inventario en caso de implementarse
        Producto mouse = new Producto("Mouse", 300, "Accesorios", 10);
        Producto laptop = new Producto("Laptop", 15000, "Electrónica", 5);
        Producto teclado = new Producto("Teclado", 800, "Accesorios", 0); //sin stock para prueba

        // Cliente precargado.
        Cliente elias = new Cliente("Oscar Fuentes", "ofuentes@ejemplo.com");

        // Se empieza la venta.
        Venta venta1 = new Venta(elias);

        //compra dos productos.
        ItemVenta item1 = new ItemVenta(laptop, 1);
        ItemVenta item2 = new ItemVenta(mouse, 2);
        ItemVenta item3 = new ItemVenta(teclado, 1); //Este no se debería agregar por falta de stock, pero sí lo hace, posbile mejora.

        //Se agregan los items a la venta o al carrito.
        venta1.agregarItem(item1);
        venta1.agregarItem(item2);
        venta1.agregarItem(item3); //Se agrega el item aunque no haya stock para avisar al usuario en el ticket, aunque debería ser antes.

        //Se imprime ticket de la venta.
        venta1.generarTicket();

        //Solo para saber sí hace la función de reducir stock. Se podría hacer un código más corto usando algun for y un array.
        System.out.println("\nStock restante de"+ laptop.getNombre()+": " + laptop.getStock());
        System.out.println("Stock restante de"+ mouse.getNombre()+": " + mouse.getStock());
        System.err.println("Stock restante de"+ teclado.getNombre()+": " + teclado.getStock());

    }

}
