import java.util.Scanner;
public class Mtest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<b;i++)
          {
            if(i%2==1)
            sum+=i;
            else
            sum-=i;
          }
          System.out.println(sum);
          
          sc.close();
    }

}