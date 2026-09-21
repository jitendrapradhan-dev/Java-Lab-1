import java.util.Scanner;
 class prog11{
  public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   System.out.println("enter the  five subject marks:-");
     int s1=sc.nextInt();
      int s2=sc.nextInt();
       int s3=sc.nextInt();
      int s4=sc.nextInt();
       int s5=sc.nextInt();
    int total=s1+s2+s3+s4+s5;
   double percentage=total/5.0;
  System.out.println("the  five subject total marks:-" +total);
  System.out.println(" the  five subject precentage:-" +percentage);
}
}