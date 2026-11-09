class vehicle{
    void drive(){
  System.out.println("Repairing a vehicle");
}
  }
class car extends vehicle{
    void drive(){
   System.out.println("Repairing a car");
}
public static void main(String args[]){
    car c = new car();
        c.drive();
}
}
