package Logica;

public class Controladora {

    String nombres [] = new String [5];

    public void cargarNombre (String nuevoNombre) {

        for (int i = 0; i < nombres.length; i++) {
            
            if (nombres[i] == null) {
                nombres[i] = nuevoNombre;
                i = nombres.length;
            }
        }
    }

    public boolean buscarNombres(String nuevoNombre) {
        
        boolean resultadoBusqueda = false;

        for (int i = 0; i < nombres.length; i++) {
            
            if (nombres[i].equals(nuevoNombre)) {
                resultadoBusqueda = true;
                i = nombres.length;
            }
        }

        return resultadoBusqueda;
    }
}
