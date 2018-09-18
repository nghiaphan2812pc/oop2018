package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup() == s2.getGroup();
    }

    void studentsByGroup() {
        // TODO:

    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student sv = new Student("Phan Duc Nghia", "17020927", "nghiaphan2812pc@gmail.com");
        sv.setGroup("INT 2004 4");
        System.out.println(sv.getName());
        sv.getInfo();
        Student nghia = new Student();
        nghia.setName("Phan Duc Nghia");
        nghia.setGroup("INT 2204 4");
        nghia.setId("17020927");
        nghia.setEmail("nghiaphan2812pc@gmail.com");
        Student nam = new Student();
        Student phat = new Student();
        Student minh = new Student();
        nam.setGroup("INT22041");
        phat.setGroup("INT22041");
        minh.setGroup("INT22042");
        sameGroup(nam,phat);
    }
}