import java.util.*;
  
  public class decimaltobase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       // write code here
       int rem=0,ans=0,pow=1;
       while(n>0){
           rem=n%b;
           n/=b;
           ans+=rem*pow;
           pow=pow*10;
       }
       return ans;
   }
  }