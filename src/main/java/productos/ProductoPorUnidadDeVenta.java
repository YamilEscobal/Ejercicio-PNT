package productos;


public class ProductoPorUnidadDeVenta extends Producto {

        private String unidadDeVenta;

        public String getUnidadDeVenta() {
            return unidadDeVenta;
        }

        public void setUnidadDeVenta(String unidadDeVenta) {
            this.unidadDeVenta = unidadDeVenta;
        }

        public ProductoPorUnidadDeVenta(String nombre, int precio, String unidadDeVenta) {
            super(nombre, precio);
            this.unidadDeVenta = unidadDeVenta;
        }

        @Override
        public String toString() {
            return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + getUnidadDeVenta();
        }

}
