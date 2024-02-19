package Student;

import StudentBuilder.StudentBuilder;

import java.util.List;

public class Student {
    private int rollNo;
    private String name;
    private String fatherName;
    private String motherName;
    private List<String> subjects;

    public Student(StudentBuilder obj){
        this.rollNo = obj.getRollNo();
        this.name = obj.getName();
        this.fatherName = obj.getFatherName();
        this.motherName = obj.getMotherName();
        this.subjects = obj.getSubjects();
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }
}
