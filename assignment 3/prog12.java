import java.util.Scanner;
  class prog12{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   System.out.println("enter the basic salary:-");
double basic=sc.nextDouble();
  double hra= basic*0.10;
  double da =basic*0.60;
 double gross=hra+da+basic;
  System.out.println("the HRA is:-"+hra);
  System.out.println("the DA is :-"+da);
 System.out.println("the gross is="+ gross);
}
}