
class Animal{
    String color;
}
class dog extends Animal{
    public void MakeSound(){
    System.out.println("Dog Color is: "+this.color);
    System.out.println("The Dog barks");
}
}
class cat extends Animal{
        public void  MakeSound(){
            System.out.println("Cat Color is: "+this.color);
            System.out.println("The Cat Sound Meow ");
        }
}


public class runtime_polym {
    public static void main(String args[]){
        dog mydog = new dog();
        cat mycat = new cat();
        
        mydog.color= "White";
        mycat.color="Black";
        mydog.MakeSound();
        mycat.MakeSound();

    }
    
}
