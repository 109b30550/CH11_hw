interface Data11{
   public void showData();
}
interface Test11{
   public void showScore();
   public double calcu();
}

class CStu11 implements Data11,Test11{
   protected String id;    
   protected String name;  
   protected int mid;
   protected int finl;
   protected int common;
   public CStu11(String s1,String s2,int m,int f,int c){
      id=s1;
      name=s2;
      mid=m;
      finl=f;
      common=c;
   }
   public void show(){
      showData();
      showScore();
   }
   public void showScore(){
      System.out.println("�����Ҧ��Z:"+mid);
      System.out.println("�����Ҧ��Z:"+finl);
      System.out.println("���ɦ��Z:"+common);
      System.out.println("�Ǵ����Z:"+calcu());
   }
   public void showData(){
      System.out.println("�Ǹ�:"+id);
      System.out.println("�m�W:"+name);
   }
   public double calcu(){
      return (mid*0.3+finl*0.3+common*0.4);
   }
}

public class Class11
{
   public static void main(String args[])
   {
      CStu11 stu=new CStu11("940001","Fiona",90,92,85);
      stu.show();
   }
}