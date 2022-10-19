package productos;


public class Producto implements Comparable<Producto> {
        private String nombre;
        private int precio;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getPrecio() {
            return precio;
        }

        public void setPrecio(int precio) {
            precio = precio;
        }

        public Producto(String nombre, int precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        @Override
        public int compareTo(Producto otroProducto) {
            if (this.precio>otroProducto.getPrecio()){
                return -1;
            }
            if (this.precio<otroProducto.getPrecio()){
                return 1;
            }else{
                return 0;
            }
        }

        @Override
        public String toString() {
            return "Nombre: " + getNombre() + " /// " + "Precio: $" + getPrecio();

        }


}
