import java.util.Scanner;
  class prog15{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the cost price:-");
       double cp=sc.nextDouble();
   System.out.println("enter the selling price:-");
       double sp=sc.nextDouble();
if(sp>cp){
  double profit=sp-cp;
 double per=(profit*100)/cp;
System.out.println("the profit is:-"+profit);
System.out.println("the percentage of profitif:-"+per);
}else if(sp<cp){
  double loss=cp-sp;
  double lper=(loss*100)/cp;
System.out.println("the loss is:-"+loss);
System.out.println("the percentage of loss is:-"+lper);
}else{
  System.out.println("no profit no loss");
}
}
}