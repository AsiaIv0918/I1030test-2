import java.util.*;
public class Main {
//測試迴文
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x,a,b,c,d,e;
        x=in.nextInt();
        a=x/10000;
        b=x/1000%10;
        c=x/100%10;
        d=x/10%10;
        e=x%10;

        if (a==e){
            if(b==d)
                System.out.print("O");
            else
                System.out.print("X");
        }else
            System.out.print("X");

    }
}
