import java.util.ArrayList;

public class Course {
    private String unit;
    private String TA;
    private ArrayList<Student> studentInCourse;

    public void setUnit(String unit){
        this.unit = unit;
    }
    public void setTA(String TA){
        this.TA = TA;
    }
    public void setStudentInCourse(ArrayList<Student> studentInCourse){
        this.studentInCourse = studentInCourse;
    }
    public String getUnit(){
        return  unit;
    }
    public String getTA(){
       return TA;
    }
    public ArrayList<Student> getStudentInCourse(){
      return studentInCourse;
    }


    public Course(String unit, String TA, ArrayList<Student> studentInCourse){
        this.unit = unit;
        this.TA= TA;
        this.studentInCourse =new ArrayList<>(studentInCourse) ;
    }
}
