class Demo{
    static int a;
    static int b;
    int m;
    int n;
    static{
        System.out.println("Control on static block");
        a=10;
        b=20;
    }
    {
        System.out.println("Contrl on non static block");
        m=30;
        n=40;
    }
    static void disp1(){
         System.out.println("the static variable a is "+a);
          System.out.println("the static variable b is "+b);

    }
       void disp2(){
        System.out.println("the value of non static variable m is "+m);
         System.out.println("the value of non static variable m is "+n);
    }
}
public class Static{
    public static void main(String args[]){
        Demo d = new Demo();
        //TO CALL STATIC MEHOD WE JUST CALL BY CLASS NAME
        Demo.disp1();
        d.disp2();

    }
}