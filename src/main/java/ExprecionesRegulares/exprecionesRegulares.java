package ExprecionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exprecionesRegulares {



    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, proporciona una cadena como argumento.");
            return;
        }
        String cadena = args[0];
        // Buscar la frase Hola mundo
        Pattern p1 = Pattern.compile("\\bHola mundo\\b");
        Matcher m1 = p1.matcher(cadena);
        if (m1.matches()) {
            System.out.println("La cadena coincide con la frase exacta 'Hola mundo'.");
        }

        // Buscar la frase Hola mundo en cualquier combinación de mayúsculas y minúsculas
        Pattern p2 = Pattern.compile("(?i)\\bHola mundo\\b");
        Matcher m2 = p2.matcher(cadena);
        if (m2.matches()) {
            System.out.println("La cadena coincide con la frase 'Hola mundo' en cualquier combinación de mayúsculas y minúsculas.");


        }

        // Buscar cualquiera de las palabras Java, Python, Go, Pascal, Perl
        Pattern p3 = Pattern.compile("\\b(Java|Python|Go|Pascal|Perl)\\b");
        Matcher m3 = p3.matcher(cadena);
        if (m3.matches()) {
            System.out.println("La cadena contiene una de las palabras Java, Python, Go, Pascal, Perl.");
        }

// Validar un correo de la Universidad de Sonora
        Pattern p4 = Pattern.compile("^[a-zA-Z0-9._%+-]+@(unison\\.mx|uson\\.mx)$");
        Matcher m4 = p4.matcher(cadena);
        if (m4.matches()) {
            System.out.println("La cadena es un correo válido de la Universidad de Sonora.");
        }

        // Validar el nombre de un archivo prefijo ISI, año y extensión específica
        Pattern p5 = Pattern.compile("^ISI\\d{4}-[12]\\.(txt|csv)$");
        Matcher m5 = p5.matcher(cadena);
        if (m5.matches()) {
            System.out.println("La cadena es un nombre de archivo válido según el formato especificado.");
        }

        if (!m1.matches() && !m2.matches() && !m3.matches() && !m4.matches() && !m5.matches()) {
            System.out.println("La cadena no coincide con ninguna de las expresiones regulares especificadas.");
        }}
}