package Logica;

public class Controlador {
    
    String nombres [] = new String [5];
    
    public void cargarNombre (String textCargarNombre) {
        
        for (int i = 0; i < nombres.length; i++) {
            
            if (nombres[i] == null) {
                nombres[i] = textCargarNombre;
                i = nombres.length;
            }
        }
    }
    public boolean buscarNombre (String textBuscarNombre) {
        
        boolean estado = false;
        
        for (int i = 0; i < nombres.length; i++) {
            
            if(nombres[i].equals(textBuscarNombre)) {
                estado = true;
            }
        }
        
        return estado;
    }
    
}
