class prog33{
  static void recA(int len,int brd){
     int area=len*brd;
System.out.println("Area of rectangle="+area);
}
void sqrA(int side){
    int area=side*side;
System.out.println("Area of square="+area);
}
public static void main(String args[]){
   prog33.recA(10,6);
   prog33 s = new prog33();
      s.sqrA(6);
}
}
   

