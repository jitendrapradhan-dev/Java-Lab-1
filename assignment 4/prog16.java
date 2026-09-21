import java.util.Scanner;
 class prog16{
  public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
   System.out.println("enter the value of a:-");
    double a=sc.nextDouble();
 System.out.println("enter the value of b:-");
    double b=sc.nextDouble();
 System.out.println("enter the value of c:-");
    double c=sc.nextDouble();
   double d=b*b-4*a*c;
 if(d>0){
 double r1=(-b+Math.sqrt(d))/2*a;
double r2=(-b-Math.sqrt(d))/2*a;
System.out.println("root1 is "+r1);
System.out.println("root2 is "+r2);
} else if(d==0){
 double r=-b/2*a;
 System.out.println("root is "+r);
}else{
 System.out.println("root is imaginary");
}
}
}




