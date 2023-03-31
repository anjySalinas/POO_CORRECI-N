package Figuras;

public class Triangulo extends Figura{

    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calcularArea(){
        int area=0;
        area=(base*altura)/2;
        System.out.println("el area del triangulo digitado es:" +area);
    }
   

}
