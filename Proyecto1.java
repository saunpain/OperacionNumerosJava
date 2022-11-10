//Realizado por Jeannine Acosta, Joshua Sanchez, Enedina Ortega y Nadim Garcia
//Grupo 1LS212
//

import java.util.Scanner;

public class Proyecto1 {

    public static void main(String[] args){

        int numero, opcion, exponente, posicion, eliminacion, agregar, inicio, finale, multiplo;

        Numeros num = new Numeros(); //instanciacion de la clase Numeros
        Scanner sc = new Scanner(System.in); //creacion del objeto Scanner

        System.out.println("\t\tTabla de operaciones con numeros");
        System.out.println("1- Verificar si un numero es Capicua");
        System.out.println("2- Verificar si un numero es Primo");
        System.out.println("3- Buscar el siguiente numero primo");
        System.out.println("4- Calcular una potencia");
        System.out.println("5- Contar el numero de digitos de un numero entero");
        System.out.println("6- Voltear un numero");
        System.out.println("7- Buscar digito segun la posicion");
        System.out.println("8- Encontrar la posicion de un digito");
        System.out.println("9- Quitar una cantidad N de digitos por la derecha");
        System.out.println("10- Quitar una cantidad N de digitos por la izquierda");
        System.out.println("11- Añadir una cantidad N de digitos por la derecha");
        System.out.println("12- Añadir una cantidad N de digitos por la derecha");
        System.out.println("13- Devolver el trozo de un numero");
        System.out.println("14- Pega 2 numeros");
        System.out.println("15- Verificar si un numero es par");
        System.out.println("16- Verificar si un numero es multiplo de otro");

        opcion = sc.nextInt();//captura de la opcion con Scanner

        switch (opcion) {
            case 1 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();//captura del numero con Scanner
                boolean capicua = num.esCapicua(numero);
                System.out.print("El número " + (capicua ? " sí" : " no") + " es capicua");
            }
            case 2 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();//captura del numero con Scanner
                boolean primo = num.esPrimo(numero);
                System.out.println("El número " + (primo ? " sí" : " no") + " es primo");
            }
            case 3 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();//captura del numero con Scanner
                int valor = num.siguientePrimo(numero);
                System.out.println("El siguiente numero primo es: " + valor);
            }
            case 4 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();//captura del numero con Scanner
                System.out.println("Inserte un exponente");
                exponente = sc.nextInt();//captura del numero con Scanner
                int potencia = num.potencia(numero, exponente);
                System.out.println("El resultado de la potencia es: " + potencia);
            }
            case 5 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                int longitud = num.digitos(numero);
                System.out.println("El numero tiene " + longitud + " digitos");
                System.out.println("Quiere realizar otra operacion? (s/n)");
            }
            case 6 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                int volteado = num.voltea(numero);
                System.out.print("El numero volteado es: " + volteado);
            }
            case 7 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                System.out.print("Inserte que posicion quiere imprimir: ");
                posicion = sc.nextInt();
                int digito = num.digitoN(numero, posicion);
                System.out.println("El digito que corresponde a la posicion insertada es: " + digito);
            }
            case 8 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                System.out.print("Inserte el numero que desea buscar: ");
                posicion = sc.nextInt();
                int posicionDeDigito = num.posicionDeDigito(numero, posicion);
                System.out.println("El digito esta en la posicion: " + posicionDeDigito);
            }
            case 9 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                System.out.print("Cuantos numeros desea eliminar?: ");
                eliminacion = sc.nextInt();
                int quitarPorDt = num.quitaPorDetras(numero, eliminacion); //quitarPorDt = Detras
                System.out.println("El resultado es: " + quitarPorDt);
            }
            case 10 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                System.out.print("Cuantos numeros desea eliminar?: ");
                eliminacion = sc.nextInt();
                int quitarPorDl = num.quitaPorDelante(numero, eliminacion); //quitarPorDl = Delante
                System.out.println("El resultado es: " + quitarPorDl);
            }
            case 11 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                System.out.print("Que numero desea agregar?: ");
                agregar = sc.nextInt();
                int pegaPorDt = num.pegaPorDetras(numero, agregar); //pegaPorDt = Detras
                System.out.println("El resultado es: " + pegaPorDt);
            }
            case 12 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                System.out.print("Que numero desea agregar?: ");
                agregar = sc.nextInt();
                int pegaPorDl = num.pegaPorDelante(numero, agregar); //pegaPorDl = Delante
                System.out.println("El resultado es: " + pegaPorDl);
            }
            case 13 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                System.out.print("Desde que digito desea recortar?: ");
                inicio = sc.nextInt();
                System.out.print("Hasta que digito?: ");
                finale = sc.nextInt();
                int trozo = num.trozoDeNumero(numero, inicio, finale);
                System.out.println("El trozo es: " + trozo);
            }
            case 14 -> {
                System.out.print("Ingrese el primer numero: ");
                numero = sc.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                agregar = sc.nextInt();
                int pegar = num.juntaNumeros(numero, agregar);
                System.out.println("Los numeros juntos dan como resultado: " + pegar);
            }
            case 15 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                boolean par = num.esPar(numero);
                System.out.println("El número " + (par ? " sí" : " no") + " es par");
            }
            case 16 -> {
                System.out.print("Inserte un numero: ");
                numero = sc.nextInt();
                System.out.print("Que multiplo desea verificar: ");
                multiplo = sc.nextInt();
                boolean esmultiplo = num.esMultiplo(numero, multiplo);
                System.out.println("El número " + (esmultiplo ? " sí" : " no") + " es multiplo de" + multiplo);
            }
        }

        sc.close();//cierre de la instancia del Scanner
    }//fin main
}//fin  Proyecto1

class Numeros{
    boolean esCapicua(int numero){
        return numero == voltea(numero);
    }

    boolean esPrimo(int numero){
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }

    int siguientePrimo(int numero){
        int valor = numero;
        while(true){
            valor += 1;
            if(esPrimo(valor)){
                return valor;
            }
        }
    }

    int potencia(int numero, int exponente){
        return (int) Math.pow(numero, exponente);
    }

    int voltea(int numero){
        int cifra, inverso = 0;
        while(numero > 0){
            cifra = numero % 10;
            inverso = cifra + inverso * 10;
            numero /= 10;
        }
        return inverso;
    }

    int digitos(int numero){
        int longitud = 0;
        String numCadena = String.valueOf(numero);
        for (int i = 0; i < numCadena.length(); i++){
            longitud += 1;
        }
        return longitud;
    }

    int digitoN(int numero, int posicion){
        String numCadena = String.valueOf(numero); //conversion de entero a cadena
        String posCadena = String.valueOf(posicion); //conversion de entero a cadena
        char[] numArray = numCadena.toCharArray(); //conversion de cadena a arreglo
        int posArray = numCadena.indexOf(posCadena); //busqueda del numero
        String digito = String.valueOf(numArray[posArray]); //conversion del caracter a cadena
        return Integer.parseInt(digito); //conversion a entero y retorno
    }

    int posicionDeDigito(int numero, int posicion){
        String numCadena = String.valueOf(numero);
        String posCadena = String.valueOf(posicion);
        return numCadena.indexOf(posCadena);
    }

    int quitaPorDetras(int numero, int eliminacion){
        String numCadena = String.valueOf(numero);
        numCadena = numCadena.substring(eliminacion);
        return Integer.parseInt(numCadena);
    }

    int quitaPorDelante(int numero, int eliminacion){
        String numCadena = String.valueOf(numero);
        numCadena = numCadena.substring(0, numCadena.length() - eliminacion);
        return Integer.parseInt(numCadena);
    }

    int pegaPorDetras(int numero, int agregar){
        String numCadena = String.valueOf(numero);
        String cadena = agregar + numCadena;
        return Integer.parseInt(cadena);
    }

    int pegaPorDelante(int numero, int agregar){
        String numCadena = String.valueOf(numero);
        String cadena = numCadena + agregar;
        return Integer.parseInt(cadena);
    }

    int trozoDeNumero(int numero, int inicio, int finale){
        String numCadena = String.valueOf(numero);
        numCadena = numCadena.substring(inicio, finale);
        return Integer.parseInt(numCadena);
    }

    int juntaNumeros(int numero, int agregar){
        String numCadena = String.valueOf(numero);
        String numAgr = String.valueOf(agregar);
        String cadena =  numCadena + numAgr;
        return Integer.parseInt(cadena);
    }

    boolean esPar(int numero){
        return numero % 2 == 0;
    }

    boolean esMultiplo(int numero, int multiplo){
        return numero % multiplo == 0;
    }
}//fin Numeros