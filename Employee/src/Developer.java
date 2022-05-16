
public class Developer extends Employee {
    private int overtimeHours;

    public Developer() {

    }

    public Developer(int id, String name, String email, int basicSalary, int overtimeHours) {
        super(id, name, email, basicSalary);
        this.overtimeHours = overtimeHours;
    }

    public Developer(int i, String nguyen_van_a, String s, int i1) {
    }

    @Override
    int calculateSalary() {
        return 0;
    }

}
