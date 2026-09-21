import java.util.Scanner;
  class prog17{
  public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
 System.out.println("enter the 1st floting value:-");
  float a=sc.nextFloat();
   System.out.println("enter the 2nd  floting value:-");
  float b=sc.nextFloat();
int c =(int)((a-(int)a)*1000);
int d =(int)((b-(int)b)*1000);
 System.out.println(c);
 System.out.println(d);
if(c==d){
 System.out.println("the value are equal");
}else{
 System.out.println("the value are not equal");
}
}
}

 


  