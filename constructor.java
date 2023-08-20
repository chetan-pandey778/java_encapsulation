    class demo{
        private int a;
        private int b;
    public demo(){
        System.out.println("This is zero perametrize constructor made by programmer");

    }
    public demo(int a,int b){
        this.a = a;
        this.b=b;

    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
    }

} 
    public class constructor{

      public static void main(String args[]){
        demo obj = new demo();
        obj.disp();
        demo obj1 = new demo(10, 20);
        obj1.disp();
        
    }

}
    

