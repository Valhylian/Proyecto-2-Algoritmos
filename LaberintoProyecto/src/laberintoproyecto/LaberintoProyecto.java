
import java.io.IOException;
import laberintoproyecto.Individuo;
import laberintoproyecto.ProcesamientoImagenes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author valeria
 */
public class LaberintoProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws IOException
    {
     ProcesamientoImagenes.getPixel(0,0);
     ProcesamientoImagenes.setPixel(0,10,1);
     //Individuo.generarPoblacion(20, 50, 50, 1);
    }
    
}
