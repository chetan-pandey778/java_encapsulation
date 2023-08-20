class student
{
    private int age;
    private String name;
    public void setData1(int age){
        // THIS IS SHADOWING PROBLEM--->
        // age = age;
        // to solve that problem we use "this" keyword
        this.age = age;
        
    }
        public void setData2(String name){
          this.name = name;

    }
    public void show()
    {
        System.out.println(name +" "+ age);
    }

}
public class encapsulation{
    public static void main(String args[]){
        student obj = new student();
        student obj1 = new student();
        obj.setData1(17);
        obj.setData2("chetan");
         obj.show();
         obj1.setData1(23);
         obj1.setData2("chandu");
         obj1.show();
         
    }
}