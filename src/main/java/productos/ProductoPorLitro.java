package productos;


public class ProductoPorLitro extends Producto {
    private double litros;

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    public ProductoPorLitro(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Litros: " + getLitros() + " /// Precio: $" + getPrecio();
    }
}