package s;

public class test {
    public static void main(String[] args) {
        // Tạo đối tượng person
        person person = new person();

        // Khởi tạo thuộc tính cho person
        person.name = "Bùi Hiên";
        person.age = 25;
        person.address = "Thái Bình";

        // In ra thông tin của đối tượng person
        System.out.println(person.name + " - " + person.age + " - " + person.address);

        // Thay đổi tượng tính của person
        person.address = "Hà Nội";

        // Sử dụng toString đã được overide để hiển thị thông tin của person
        // System.out.println(person);
        // Hoặc
        System.out.println(person.toString());

        // Phương thức
        person.play();
        person.eat("phở");
        System.out.println(person.name + " sinh năm " + person.getYearOfBirth());
    }



    }
