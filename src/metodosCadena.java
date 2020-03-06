
public class metodosCadena {

    public String concatenado(String cadena) {
        String cadenaFinal = "";
        String[] tokenEspacios = cadena.split(" ");

        for (int i = 0; i < tokenEspacios.length; i++) {
            if (tokenEspacios[i].length() <= 3) {
                cadenaFinal += tokenEspacios[i] + "way" + " ";
            } else {
                int primer = tokenEspacios[i].charAt(0);
                int segundo = tokenEspacios[i].charAt(1);
                char primero = tokenEspacios[i].charAt(0);
                char segundoo = tokenEspacios[i].charAt(1);

                if (((primer != 97) && (segundo != 97)) && ((primer != 101) && (segundo != 101)) && ((primer != 105) && (segundo != 105)) && ((primer != 111) && (segundo != 111)) && ((primer != 117) && (segundo != 117))) {

                    String tempo = "";
                    for (int j = 2; j < tokenEspacios[i].length(); j++) {
                        tempo += tokenEspacios[i].charAt(j);
                    }
                    cadenaFinal += tempo + primero + segundoo + "ay" + " ";
                } else if (((primer != 97)) || ((primer != 101)) || ((primer != 105)) || ((primer != 111)) || ((primer != 117))) {
                    String tempo = "";
                    for (int j = 1; j < tokenEspacios[i].length(); j++) {
                        tempo += tokenEspacios[i].charAt(j);
                    }
                    // System.out.print("Maquina: ");
                    cadenaFinal += tempo + primero + "ay" + " ";
                }
            }
        }

        // System.out.println(cadenaFinal);
        return cadenaFinal;

    }

    public void ReplaceAscii(String chain) {

        char c;
        int ascii, num = 0, letra;
        // chain = chain.toLowerCase();
        System.out.print("Maquina: ");
        for (int i = 0; i < chain.length(); i++) {
            c = chain.charAt(i);

            ascii = c;// le asigno ascii el numero de posicion en donde se encuentra la letra
            if (ascii >= 65 && ascii <= 90) {
                num = ascii + ' ';
               // System.out.print(num + " ");
            } else if (ascii >= 97 && ascii <= 122) {// utilizando el
                num = ascii + ' ';
               // System.out.print(num + " ");

            } else if (num == 0) {
                System.out.print("");
            }

        }
        System.out.println();

    }

    public String patron3(String chain) {
        String acumOrden = "";
        char c;
        String[] tokens = chain.split(" ");
        for (int i = 0; i < tokens.length; i++) {
            for (int j = 0; j < tokens[i].length(); j++) {
                int pos;
                int resta;
                int desplazamiento = 0;
                if (tokens[i].charAt(j) >= 65 && tokens[i].charAt(j) <= 90) {
                    int letra = tokens[i].charAt(j);
                    pos = letra - 65;
                    resta = 25 - pos;
                    desplazamiento = 65 + resta;
                } else if (tokens[i].charAt(j) >= 97 && tokens[i].charAt(j) <= 122) {
                    int letra = tokens[i].charAt(j);
                    pos = letra - 97;
                    resta = 25 - pos;
                    desplazamiento = 97 + resta;

                }
                acumOrden += (char) desplazamiento;

            }
            acumOrden += " ";

        }
        return acumOrden;

    }

}
