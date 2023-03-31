package Figuras;

public class Cuadrado extends Figura {
    
    private int lado;

    public Cuadrado (int lado){ //metodo con parametros
        this.lado=lado; 
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public void calcularArea(){
        int area=0;
        area=lado+lado+lado+lado;
        System.out.println("el area del cuadrado es:" +area);
    }
    
}
