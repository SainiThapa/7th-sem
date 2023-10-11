//Encapsulation
public class qn7{
    private int age;
    private String name;

    //constructor
    public qn7(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
//        System.out.println(this.name);
        return this.name;
    }

    public int getAge() {
//        System.out.println(age);
        return this.age;
    }

    public static void main(String[] args) {
        qn7 e = new qn7(22,"Prisan");
        int resultAge = e.getAge();
        String name = e.getName();
        System.out.println(resultAge);
        System.out.println(name);

    }
}