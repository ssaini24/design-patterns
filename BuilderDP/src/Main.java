import Director.Director;
import Student.Student;
import StudentBuilder.EngineeringStudentBuilder;
import StudentBuilder.MBAStudentBuilder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to builder design pattern!");

        Director director = new Director(new EngineeringStudentBuilder());
        Student engineeringStudent  = director.createStudent();
        System.out.println(engineeringStudent.getRollNo());
        System.out.println(engineeringStudent.getSubjects());

        Director director1 = new Director(new MBAStudentBuilder());
        Student mbaStudent = director1.createStudent();
        System.out.println(mbaStudent.getRollNo());
        System.out.println(mbaStudent.toString());
        System.out.println(mbaStudent.getSubjects());
    }
}