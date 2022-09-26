package Entidades_Ex06;

/**
 *
 * @author NeuenMartinez
 */
public class Ahorcado {

    private String [] palabra;
    private int letras;
    private int cantIntentos;
    private int longitud;
    private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantIntentos, int longitud, int intentos) {
        this.palabra = palabra;
        this.cantIntentos = cantIntentos;
        this.longitud = longitud;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getCantIntentos() {
        return cantIntentos;
    }

    public void setCantIntentos(int cantIntentos) {
        this.cantIntentos = cantIntentos;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    
}
