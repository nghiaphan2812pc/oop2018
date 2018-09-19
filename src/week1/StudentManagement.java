package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100];
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup() == s2.getGroup();
    }
    public void cong(Student sv)
    {
        int n=0;
        students[n++] = sv;
    }
    void studentsByGroup() {
        // TODO:
        String [] Group= new String[100];
        int i,j,solop=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<solop;j++)
            {
                if(students[i].getgroup()==Group[j]) break;
            }
            if(j==solop)
            {Group[solop++]=students[i].getgroup();}
        }
        for(j=0;j<solop;j++)
        {
            System.out.println("ten lop : " + Group[j]);
            for( i=0;i<n;i++)
            {
                if(students[i].getgroup()==Group[j])
                {
                    students[i].getInfo();
                    System.out.println(" ");
                }
            }
        }
    }

    void removeStudent(String id) {
        // TODO:
        for (int i=0;i<n;i++)
        {
            if(students[i].getid()==id)
            {
                for(int j=i;j<n-1;j++)
                {
                    students[j]=students[j+1];
                }
            }
            n--;
        }
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