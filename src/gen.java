import java.util.Random;
import java.util.Scanner;

class pass{
     void word(int ww) {
        Random r = new Random();
        for(int i=0;i < ww;i++) {
            int zz = r.nextInt(4);
            if (zz == 1) {
                char a = (char) (r.nextInt(26) + 'A');
                System.out.print(a);
            }
            else if (zz == 2) {
                char a = (char) (r.nextInt(26) + 'a');
                System.out.print(a);
            }
            else if (zz == 3) {
                int b = (r.nextInt(9));
                System.out.print(b);
            }
            else {
                String s = "?!@#$%^&*";
                int rr = r.nextInt(s.length());
                char a = s.charAt(rr);
                System.out.print(a);
            }
        }
    }
}
public class gen {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("how long do you want the password to be ?");
        int num = t.nextInt();
        pass p= new pass();
        System.out.println("your strong password will be:- ");
        p.word(num);
    }
 }