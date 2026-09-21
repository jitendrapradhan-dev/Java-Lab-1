class moive{
  String title;
  String director;
  String actor;
  String reviews;
moive(String t, String d, String r){
  title=t;
  director=d;
  actor=a;
}
void add reviews(String r){
     reviews=r;
}
void display(){
System.out.println("Moive Details:");
System.out.println("Title:"+title);
System.out.println("Director:"+director);
System.out.println("Actor:"+actor);'
System.out.println("Reviews:"+reviews);
}
public static voidmain(String args[]){
   moive m = new moive("sallar","Prasant Neel","Prabash");
    m.add reviews("This moive is good");
     m.display();
}
}

