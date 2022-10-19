package productos;


public class ProductoPorContenido extends Producto {
    private int contenido;

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public ProductoPorContenido(String nombre, int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Contenido: " + getContenido() + "ml /// Precio: $" + getPrecio();
    }
}
