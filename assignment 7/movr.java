class movr{
  void simpleI(int principal,int time){
   double rate=5;
 double si=(principal*rate*time)/100;
System.out.println("simple intrest="+si);
}
void simpleI(int principal,int time,double rate){
  double si=(principal*rate*time)/100;
System.out.println("simple intrest="+si);
}
public static void main(String args[]){
  movr obj=new movr();
  obj.simpleI(10000,2);
 obj.simpleI(10000,2,8.0);
}
}