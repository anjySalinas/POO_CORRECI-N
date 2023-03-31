package Salud;

public class Empleado extends Persona {
    
    String cargo;
    int valorHora;
    int horaTrabajo;
    String departamento;
    int calcular=0;

    
    public Empleado(String tipDoc, int documento, String nombre, String apellido,
        String cargo, int valorHora, int horaTrabajo, String departamento, int calcular) {
    super(tipDoc, documento, nombre, apellido);
    this.cargo = cargo;
    this.valorHora = valorHora;
    this.horaTrabajo = horaTrabajo;
    this.departamento = departamento;
    this.calcular = calcular;
    
}


   /* public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getValorHora() {
        return valorHora;
    }
    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    public int getHoraTrabajo() {
        return horaTrabajo;
    }
    public void setHoraTrabajo(int horaTrabajo) {
        this.horaTrabajo = horaTrabajo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public int getCalcular() {
        return calcular;
    }
    public void setCalcular(int calcular) {
        this.calcular = calcular;
    }*/

    public void mostrarDatos() {
    System.out.println(getNombre()+""+getApellido()+ " su tipo de documento es "+getTipDoc()+" su numero de identificacion es "+getDocumento()+" el cargo que realiza es "+cargo+" las horas trabajadas son "+horaTrabajo+" en el departamento "+departamento);
    }


    public void calcularhonorarios(){
        
        calcular=(valorHora*horaTrabajo);
        System.out.println("sus ganancias son de: "+calcular);
            }

}