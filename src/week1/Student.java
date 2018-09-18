package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name, id, group, email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    /**
     * Constructor 1
     */

    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    public Student(String n, String sid, String em) {
        // TODO:
        name = n;
        id = sid;
        email = em;
        group = "INT22041";
    }

    /**
     * Constructor 3
     * @param
     */
    Student(Student s) {
        // TODO:
        name = s.getName();
        id = s.getId();
        group = s.getGroup();
        email = s.getEmail();
    }

    String getInfo() {
        // TODO:in ra
        System.out.println(name);
        System.out.println(id);
        System.out.println(group);
        System.out.println(email);
        //return null; // xóa dòng này sau khi cài đặt
    }