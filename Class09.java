interface Math09{
   public void show();
   public void add(int a,int b);
   public void sub(int a,int b);
   public void mul(int a,int b);
   public void div(int a,int b);
}
interface AdvanceMath09{
   public void mod(int a,int b);
   public void fac(int a);
   public void pow(int a,int b);
}
class Compute09 implements Math09,AdvanceMath09{
   public int ans;
   public void add(int a,int b){
      ans=a+b;
   }
   public void sub(int a,int b){
      ans=a-b;
   }
   public void mul(int a,int b){
      ans=a*b;
   }
   public void div(int a,int b){
      ans=a/b;
   }
   public void mod(int a,int b){
      ans=a%b;
   }
   public void fac(int a){
      ans=1;
      for(int i=1;i<=a;i++)
         ans*=i;
   }
   public void pow(int a,int b){
      ans=1;
      for(int i=1;i<=b;i++)
         ans*=a;
   }
   public void show(){
      System.out.println("ans="+ans);
   }
}
public class Class09
{
   public static void main(String args[])
   {
      Compute09 cmp=new Compute09();
      cmp.mul(3,5);
      cmp.show();
      cmp.mod(14,5);
      cmp.show();
      cmp.fac(5);
      cmp.show();
   }
}