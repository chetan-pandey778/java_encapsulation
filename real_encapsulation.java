class student{
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String name;

}
public class real_encapsulation {
    public static void main(String args[]){
        student obj = new student();
        student obj1 = new student();
        obj.setAge(18);
        obj1.setAge(25);
        obj.setName("chetan");
        obj1.setName("pandey");
        int stud1Age = obj.getAge();
        System.out.println(stud1Age);

        
    }

    
}
