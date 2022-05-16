public class sutden {

    public String id;
    public String name;
    public int theoryPoint;
    public int practicePoint;

    public sutden(String id, String name, int theoryPoint, int practicePoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTheoryPoint() {
        return theoryPoint;
    }

    public void setTheoryPoint(int theoryPoint) {
        this.theoryPoint = theoryPoint;
    }

    public int getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(int practicePoint) {
        this.practicePoint = practicePoint;
    }

    public sutden(){

    }

    public static void main(String[] args) {
        System.out.println("khang");
    }


}
