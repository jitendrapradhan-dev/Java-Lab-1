import java.lang.*;
class prog28{
public static void main(String args[]){
int a[]={25,14,56,15,36,77,18,29,49};
 int max=a[0];
int min=a[0];
for(int i=0;i<a.length;i++){
 if(a[i]>max)
 max=a[i];
if(a[i]<min)
min=a[i];
}
System.out.println("output:-maximum value="+max);
System.out.println("minimum value is"+min);
}
}
