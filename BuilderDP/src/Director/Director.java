package Director;

import Student.Student;
import StudentBuilder.StudentBuilder;
import StudentBuilder.EngineeringStudentBuilder;
import StudentBuilder.MBAStudentBuilder;

public class Director {

    private final StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        if (this.studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        } else if (this.studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }

        return null;
    }

    public Student createEngineeringStudent(){
        return studentBuilder.setRollNo(2).setSubjects().build();
    }

    public Student createMBAStudent(){
        return studentBuilder.setRollNo(10).setSubjects().build();
    }
}
