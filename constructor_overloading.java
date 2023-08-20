class student{
    private int age;
    private String name;
    public student(){
        System.out.println("Default constructor type");
        name = "chetan";
        age =18;
    }
    public student(String name){
        System.out.println(" Taking string type prameter ");
        this.name = name;
        age =19;
    }
    public student(String name,int age){
        System.out.println("Taking int and string both");
        this.age = age;
        this.name = name;
    }
     void disp(){
        System.out.println(name);
        System.out.println(age);
     }
}

public class constructor_overloading {
    public static void main(String args[]){
        student obj = new student();
        obj.disp();
        student obj1 = new student("chetan");
        obj1.disp();
        student obj2 = new student("chetan", 20);
        obj2.disp();

    }
    
}
