class student{
   int rollno;
   String name;
 student(){
 this(101,"Rahul Das");
}
student(int rollno,String name){
    this.rollno=rollno;
    this.name=name;
}
  void show(){
     this.showname();
 System.out.println("Name:"+this.name); 
System.out.println("Roll number:"+this.rollno);
}
  void showname(){
   System.out.println("Student details:");
}
 }
class q3{
   public static void main(String args[]){
       student s = new student();
         s.show();
}
  }  

 


     