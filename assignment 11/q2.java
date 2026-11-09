class q2{
  public static void main(String args[]){
       String s1="hello";
       String s2="hello";
    Boolean ans = true;
if(s1.length()!=s2.length()){
    ans=false;
}
else{
  for(int i=0;i<s1.length();i++){
     if(s1.charAt(i)!=s1.charAt(i)){
         ans=false;
       break;
} 
  }
    }
if(ans){
  System.out.println("Contain samer data");
 }
else{
  System.out.println("Not equal");
}
  }
     }



    