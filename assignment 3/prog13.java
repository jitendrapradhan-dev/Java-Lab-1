import java.util.Scanner;
  class prog13{
   public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter the previous unit:-");
  int pu=sc.nextInt();
System.out.println("enter the current unit:-");
  int cu=sc.nextInt();
double runit=cu-pu;
 System.out.println("the remaining unit is :-"+ runit);
if(runit<=100){
   double amount=100*3;
 System.out.println("the bill amount is  :-"+ amount);
}else if(runit<=500){
   double amount=(100*3+(runit-100)*4);
 System.out.println("the bill amount is  :-"+ amount);
}else{
   double amount=(100*3+400*4+(runit-500)*6);
 System.out.println("the bill amount is  :-"+ amount);
}
}
}