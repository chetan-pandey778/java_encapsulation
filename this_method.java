class student{
    private int age;
    private String name;
    public student(){
        this("chetan",19);
        name = "chetan";
        age =18;
    }
    public student(String name){
        this();
        this.name = name;
        age =19;
    }
    public student(String name,int age){
        this.age = age;
        this.name = name;
    }
     void disp(){
        System.out.println(name);
        System.out.println(age);
     }
}

public class this_method {
    public static void main(String args[]){
        student obj = new student();
        obj.disp();
        student obj1 = new student("chetan");
        obj1.disp();  

    }
    
}

