//to create object of Samosa class
public class Example {
   public static void main(String[] args) {
    Samosa s= Samosa.getSamosa();               //calling constructor of Samosa class
    System.out.println(s.hashCode());
    Samosa s2= Samosa.getSamosa();
    System.out.println(s2.hashCode());


    Jalebi j1= Jalebi.getJalebi();               //calling constructor of Samosa class
    System.out.println(j1.hashCode());
    Jalebi j2= Jalebi.getJalebi();
    System.out.println(j2.hashCode());
   }

}
