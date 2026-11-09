class Employee{
   String name;
  double salary;
    int hiredate;
 Employee(String n, double s, int h){
   name=n;
   salary=s;
   hiredate=h;
}
int yearsofservice(int curryear){
     return curryear-hiredate;
}
public static void main(String args[]){
   Employee e1= new Employee("jitu",30000,2023);
  System.out.println("Name:"+e1.name);
  System.out.println("salary:"+e1.salary);
  System.out.println("Hiredat:"+e1.hiredate);
System.out.println("Years of service:"+e1.yearsofservice(2026));
}
  }