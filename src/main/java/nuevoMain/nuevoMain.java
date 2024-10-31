package nuevoMain;

import Controlador.ControladorFernando;
import Modelo.Clases.Coche;
import Modelo.Logica.ModeloFernando;
import Vista.Vista;
import java.util.ArrayList;     

public class nuevoMain {

    public static void main(String[] args) {
        try {
            
            ModeloFernando modelo = new ModeloFernando();
            Vista vista = new Vista(); 
            ControladorFernando controlador = new ControladorFernando(modelo, vista);
    
            vista.setControlador(controlador);

            controlador.iniciar();
            
        } catch (Exception e) {
            System.out.println("Error al iniciar la aplicaci�n: " + e.getMessage());
        }
    }

}
