import java.lang.*;
class prog27{
public static void main(String args[]){
int a[]={1,2,3,4,5};
int sum=0;
for(int i=0;i<a.length;i++){
 sum=sum+a[i];
}
double avg= sum/a.length;
System.out.println("output:-the average number of thus array is "+avg);
}
 }