class calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add (double a, double b){
        return a + b;
    }
}
class student {
    String name;
    int age;

    student() {
        name = "unknown";
        age = 0;
    }

    student(String n, int a){
        name = n;
        age = a;
    }
    student(student s){
        this.name = s.name;
        this.age = s.age;
    }
    void display(){
        System.out.println("name:"+ name + ", age:" + age);
    }

    student getstudent(){
        return this;
    }

}

public class FunctionDemo{
    public static void main(String[] args){

        calculator calc = new calculator();
        System.out.println("Add two integers:" + calc.add(6, 15));
        System.out.println("Add three integers: " + calc.add(3, 14, 15));
        System.out.println("Add two doubles: " + calc.add(5.2, 4.7));

        student s1 = new student();
        student s2 = new student("Tushar",22);
        student s3 = new student(s2);

        s1.display();
        s2.display();
        s3.display();

        student s4 = s2.getstudent();
        System.out.println("student s4 details (reference to s2):");
        s4.display();

    }
}