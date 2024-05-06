package Java_Learn.Java20240506;

public class Main {

}

interface Person extends Hello{
    void run();

    String getName();
}

interface Hello {
    String hello();
}

class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + "run");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String hello(){
        return "hello";
    }
}