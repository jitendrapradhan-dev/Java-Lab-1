class person{
  String name;
   int age;
person(String n, int a){
     name=n;
     age=a;
}
public static void main(String args[]){  
     person p1 = new person("subham",19);
     person p2 = new person("Rahul",20);
System.out.println(p1.name+"  "+p1.age);
System.out.println(p2.name+"  "+p2.age);
}
 }

