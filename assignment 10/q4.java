class student{
  static int rollno;
  static String name;
  static String collegename="GIETU";
 student(int r,String n){
    rollno=r;
    name=n;
} 
static{
    System.out.println("Collegename:"+collegename);
}
static void show(){
     System.out.println("Name:"+name);
     System.out.println("Roll number:"+rollno);
}
  }
class q4{
  public static void main(String args[]){
       student s = new student(101,"Lucky");
         student.show();
   student s1 = new student(102,"Rocky");
         student.show();
}
  }
