import java.util.Scanner;
 class prog20{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
System.out.println("enter the alphabet:-");
  char ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
   System.out.println("vowel");
}else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z'){
  System.out.println("consonant");
}else{
  System.out.println("invalid value");
}
}
}
  