import java.util.Scanner;
public class task07
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("Enter a num");
    a[0]=sc.nextInt();
    int c; 
    for(c=1;c<a.length;c++){
      System.out.println("Enter a num");
      a[c]=sc.nextInt();
      int j=0;
      for(int i=0;i<c;i++){
        if(a[c]==a[i]){
          j++;
        }
      }
      if(j>=4){
        c--;
        System.out.println("Enter other num");
      }
    }
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+",");
    }
  }
}
//AAT