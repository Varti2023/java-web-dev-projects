import javax.management.remote.SubjectDelegationPermission;
import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        ArrayList<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Vartika", 1234, 1, 4);
        Student student2 = new Student("Iryna", 2123, 1, 4);
        Student student3 = new Student("Natasha", 2211, 1, 4);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        //Student student = new Student("Vartika",1111,1,4.0);
        Teacher TA1 = new Teacher("Aryse","Pagano","Javascript",2 );
        Teacher TA2 = new Teacher("Adam","Sands","Java",2 );
        Course course1 = new Course("Javascript", "Aryse", students);
        Course course2 = new Course("Java", "Adam", students);
        System.out.println(course1.getUnit() + " course has "+students.size() + " students.");
        System.out.println("Teacher for "+course1.getUnit()+" is "+TA1.getFirstName()+" "+TA1.getLastName()+".");
        System.out.println("Teacher for "+course2.getUnit()+" is "+TA2.getFirstName()+" "+TA2.getLastName()+".");
        System.out.println(student1.getName() +" has "+ student1.getGpa() + " and "+student1.getNumberOfCredits()+".");
        System.out.println("Student grade level is "+student1.getGradeLevel(student1.getNumberOfCredits()));
        //System.out.println(student1.addGrade(student1.getNumberOfCredits(), )));
    }
}
