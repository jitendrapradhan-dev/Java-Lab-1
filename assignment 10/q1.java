class Bank{
    double roi;
    void getroi(){
      System.out.println("Display the rate of intrest:");
     }
}
class sbi extends Bank{
     void getroi(){
  System.out.println("Rate of intrest SBI:"+roi);
  }
}
class Icici extends Bank{
     void getroi(){
  System.out.println("Rate of intrest Icici:"+roi);
  }
}
class Axis extends Bank{
     void getroi(){
  System.out.println("Rate of intrest Axis:"+roi);
  }
}
class q1{
   public static void main(String args[]){
       sbi s = new sbi();
         s.roi=8.4;
       s.getroi();
  Icici i = new Icici();
      i.roi=7.3;
   i.getroi();
Axis a = new Axis();
     a.roi=9.7;
 a.getroi();
}
}

   