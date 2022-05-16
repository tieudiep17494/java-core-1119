public abstract class Employee {
    private  int id;
    private String name;
    private String email;
    private int basicSalary;

    public Employee() {
    }

    public Employee(int id, String name, String email, int basicSalary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    //adstract method
    abstract int calculateSalary();

    //Normal method
    public void re

}
