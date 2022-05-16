public class Tester  extends  Employee{
    private int errors;

    public Tester(int id, String name, String email, int basicSalary, int errors) {
        super(id, name, email, basicSalary);
        this.errors = errors;
    }

    public Tester() {
    }

    @Override
    int calculateSalary() {
        return getBasicSalary() + errors *50_000;
    }
    public int getErrors()
    {
        return errors;
    }
}
