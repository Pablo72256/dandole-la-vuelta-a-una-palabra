public class Actividad2500 {
    public String darleVueltaAPalabra(String palabra) {
        String retorno = "";
        String palabraInvertida = "";
        if (palabra == ""){
            retorno = "";
        }else if (palabra == null){
            retorno = null;
        }else{
            for (int x = palabra.length() -1 ; x >= 0 ; x -- ){
                palabraInvertida = palabraInvertida + palabra.charAt(x);
            }
            retorno = palabraInvertida;
        }
        return retorno;
    }
}