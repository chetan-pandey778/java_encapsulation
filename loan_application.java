import java.util.Scanner;
class Demo{
    int pa;
    float si;
    // we made ri(rate of intrust) is static because it is same for all the loan
    // and we made all the veriable non static becaue they are different for all loan
    static float ri;
    float td;
    static {
        ri = 4.5f;
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter pa");
        pa = sc.nextInt();
        System.out.println("enter td");
        td = sc.nextFloat();

    }
    void calculate(){
        si = (pa*ri*td)/100f;
    }
    void disp(){
        System.out.println("simple intrust is "+si);
    }

}
public class loan_application {
    public static void main(String args[]){
        Demo d1 = new Demo();
        d1.input();
        d1.calculate();
        d1.disp();
        Demo d2 = new Demo();
        d2.input();
        d2.calculate();
        d2.disp();

    }
    
}
