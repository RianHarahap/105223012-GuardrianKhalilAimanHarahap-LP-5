
class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String n, int a, double s) {
        name = n;
        age = a;
        salary = s;
    }


    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

