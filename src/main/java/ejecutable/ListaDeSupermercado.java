package ejecutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import productos.Producto;
import productos.ProductoPorContenido;
import productos.ProductoPorLitro;
import productos.ProductoPorUnidadDeVenta;

public class ListaDeSupermercado {
    public static void main(String[] args) {

        ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();

        listaDeProductos.add(new ProductoPorLitro("Coca-Cola Zero",20,1.5));
        listaDeProductos.add(new ProductoPorLitro("Coca-Cola",18,1.5));
        listaDeProductos.add(new ProductoPorContenido("Shampoo Sedal",19,500));
        listaDeProductos.add(new ProductoPorUnidadDeVenta("Frutillas",64,"Kilo"));

        imprimirListaCompletaYProductoMasCaroYMasBarato(listaDeProductos);


    }
    
    private static void imprimirListaCompletaYProductoMasCaroYMasBarato(List<Producto> listaDeProductos){
        imprimirLista(listaDeProductos);
        System.out.println("=============================");
        imprimirProductoMasCaroYMasBarato(ordenarLista(listaDeProductos));
    }
    private static void imprimirLista(List<Producto> listaDeProductos){
        for(Producto producto:listaDeProductos){
            System.out.println(producto);
        }
    }

    private static List<Producto> ordenarLista(List<Producto> lista){
        Collections.sort(lista);
        return lista;
    }

    private static void imprimirProductoMasCaroYMasBarato(List<Producto> listaOrdenada){
        Producto productoMasCaro = listaOrdenada.get(0);
        Producto productoMasBarato = listaOrdenada.get(listaOrdenada.size()-1);
        System.out.println("Producto mas caro: " + productoMasCaro.getNombre());
        System.out.println("Producto mas barato: " + productoMasBarato.getNombre());

    }
}
