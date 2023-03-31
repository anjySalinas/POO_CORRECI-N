package Salud;

//import java.util.Scanner;


public class Persona {
    
    //Atributos 

    private String tipDoc;
    private int documento;
    private String nombre;
    private String apellido;
    /*protected double peso;
    private double estatura;
    private double edad;
    private String sexo;
    private double operacion;*/
    
    
    //int seguir=1;//

    /*public Persona (String tipDoc,int documento,String nombre,String apellido,double peso,double estatura,double edad,double operacion,String sexo)*/{

    }
    public Persona (){

    }
    // metodos

    public Persona(String _tipDoc, int _documento, String _nombre, String _apellido) {
      tipDoc=_tipDoc;    
      documento=_documento; 
      nombre=_nombre;
      apellido=_apellido;  
    }

 
    public String getTipDoc() {
        return tipDoc;
    }
    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;

        
    }

    /*public void pedirDatos(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("por favor digite el nombre de la persona");
        nombre=lectura.next();
        System.out.println("por favor digite el apellido de la persona");
        apellido=lectura.next();
        System.out.println("por favor digite tipo de documento");
        tipDoc=lectura.next();
        System.out.println("por favor digite numero de documento ");
        documento=lectura.nextInt();
        System.out.println("por favor digite edad");
        edad=lectura.nextDouble();
        System.out.println("por favor digite peso");
        peso=lectura.nextDouble();
        System.out.println("por favor digite su estatura");
        estatura=lectura.nextDouble();
        System.out.println("por favor digite sexo");
        sexo=lectura.next(); 
        lectura.close();
    }

     public void mostrarPersona() {
            System.out.println("los datos fueron registrados correctamente "+nombre+ apellido);
            System.out.println("su tipo de documento es "+tipDoc+" con el numero" +documento);
            System.out.println("usted tiene un peso de "+peso+" con una estatura de "+estatura+" teniendo "+edad+" años de edad siendo "+sexo);  }


        public void operacion(double peso, double estatura){
            operacion= (peso/(estatura*estatura));
        }
    
            public void mostrarResultado(){
                System.out.println("el resultado de la operacion es:"+operacion);
            }

            public void calcularMensaje(){
                if(operacion<20){
                System.out.println("el peso está por debajo de lo ideal");
            }
                else if (operacion>20&&operacion<25){ 
                System.out.println("el peso es ideal");

                } 
                else if(operacion>25) {
                    System.out.println("tiene sobrepeso");
                }
            } 
            
       /*  public void mayorEdad(){
            if (edad>18){
                System.out.println("eres mayor de edad");
            }
            else{
                System.out.println("no eres mayor de edad");
            }
        }*/
        

     }
