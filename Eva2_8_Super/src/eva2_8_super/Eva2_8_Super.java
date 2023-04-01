
package eva2_8_super;


public class Eva2_8_Super {

    public static void main(String[] args) {
        Animal Ani = new Animal(100);
        Mamifero Ma = new Mamifero("Negro " , 100);
       Perros Pe = new Perros();
        //perro.
    }
    
}
class Animal{
    private int peso;
public Animal(int peso) {
        this.peso = peso;
        System.out.println("Estoy vivo (constructor 2)");
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
     public Animal(){
        System.out.println("Estoy vivo");
    }
    public void respirar(){
        System.out.println("Estoy Respirando ");
    }
    public void comer(){
        System.out.println("Estoy Comiendo ");
        
    }
  
}
class Mamifero extends Animal{
    private String clorPelo;
      public Mamifero(){
          super();//Llamada al constructor de la superclase
          //En este caso esta llamando a animal()
          //Siempre debemos llamar primero al constructor de la superclase
          System.out.println("Soy un mamifero");
      }
    public String getClorPelo() {
        return clorPelo;
    }

    public void setClorPelo(String clorPelo) {
        this.clorPelo = clorPelo;
    }

    public Mamifero(String clorPelo, int peso) {
     super(peso);//Siempre se tiene que llamar al constructor de la super clase
        this.clorPelo = clorPelo;
        System.out.println("Soy un mamifero (Constructor 2)");
    }
     class Perros extends Mamifero{
         
     } 
  }
class Perros extends Mamifero{
         public Perros(){
             super();
             System.out.println("Perro");
         }
     } 