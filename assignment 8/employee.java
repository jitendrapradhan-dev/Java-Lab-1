class Employee{
   String name;
  double salary;
    int hiredate;
 Employee(String n, double s, int n){
   name=n;
   salary=s;
   hiredate=h;
}
int years of service(int curryear){
     return curryear-hiredate;
}
public static voidmain(String args[]){
   Employee e1= new Employee("jitu",30000,2023);
  System.out.println("Name:"+e1.name);
  System.out.println("salary:"e1.salary);
  System.out.println("Hiredat:"+e1.hiredate);
System.out.println("Years of service:"+e1.years of service(2026));
}
  }