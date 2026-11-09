import java.util.*;
   class student{
    String name;
     int rollno;
   String course;
student(String name,int rollno){
  this.name=name;
  this.rollno=rollno;
}
void choosecourse(){
  Scanner sc=new Scanner(System.in);
System.out.println("Avalible course");
System.out.println("1.java");
System.out.println("2.python");
System.out.println("3.c");
System.out.println("Enter your choice course:-");
  int choice=sc.nextInt();
if(choice==1)
   course="java";
else if(choice==2)
   course="python";
else if(choice==3)
  course="c";
else
 course="invalid";
}
void display(){
  System.out.println("Name="+name);
 System.out.println("Rollno="+rollno);
 System.out.println("course="+course);
}
public static void main(String args[]){
   student s=new student("Jitendra",105);
    s.choosecourse();
     s.display();
 }
}







