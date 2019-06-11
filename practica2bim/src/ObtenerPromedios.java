
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.36 */
/**
 *
 * @author rober
 */
public class ObtenerPromedios {

    public static void Promedios() {

        try {

            Scanner entrada = new Scanner(new File("data/tabula-FWC_2018_"
                    + "Squadlists_4.csv"));
            //  Lista de variables utilizadas
            double suma = 0;
            double promedio = 0;
            int cont = 0;
            double totalGoles = 0;
            double totalEstatura = 0;
            double goles;
            double estatura;
            double promGoles;
            double promEstatura;

            //  Entrara al bucle mientras encuentre una linea de texto
            while (entrada.hasNext()) {
                //  Almaceno todo en una variable String y seguidamente guardo
                // cada elemento en un ArrayList.
                String linea = entrada.nextLine();
                ArrayList<String> informacion = new ArrayList<>(
                        Arrays.asList(linea.split("\\|")));
                //  Le doy valor a mi variable desde el ArrayList en su posicion(11)
                goles = Double.parseDouble(informacion.get(11));
                totalGoles = goles + totalGoles;
                //  Le doy valor a mi variable desde el ArrayList en su posicion(9)
                estatura = Double.parseDouble(informacion.get(9));
                totalEstatura = totalEstatura + estatura;
                //  Aqui obtengo el numero de veces que entrara al bucle 
                cont = cont + 1;
            }
            //  Obtengo los promedios
            promGoles = totalGoles / cont;
            promEstatura = totalEstatura / cont;
            //  Salida de datos
            System.out.printf("El promedio de Goles son: %.2f\nEl promedio de "
                    + "Estatura es: %.2f\n", promGoles, promEstatura);

            //  entrara aqui cuando salga del primer ciclo repetitivo
        } catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        }
    }
}
