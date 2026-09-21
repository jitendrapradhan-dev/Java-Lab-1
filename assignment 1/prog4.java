import java.lang.*;
     class prog4{
        public static void main(String args[]){
            int a=3;
         int b=4;
         System.out.println("before swap a="+a+",b=" + b);
        a=a^b;
        b=a^b;
        a=a^b;
            System.out.println("after swap a="+a+",b=" + b);
        } 
}