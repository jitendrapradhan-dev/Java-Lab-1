import java.lang.*;
   class prog10{
   public static void main(String args[]){
   int min=1000000;
  int d,y,r;
  d=min/(60*24);
  y=d/365;
  r=d%365;
     System.out.println("DAYS="+d);
   System.out.println("years="+ y);
     System.out.println("reaming days=" +r);
}
}