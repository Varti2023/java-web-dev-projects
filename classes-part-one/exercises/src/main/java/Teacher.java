public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private int yearsOfTeaching;

    // getter and setter method -----
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setYearsOfTeaching(int yearsOfTeaching){
        this.yearsOfTeaching = yearsOfTeaching;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getSubject(){
        return subject;
    }
    public int getYearsOfTeaching(){
        return yearsOfTeaching;
    }

    public Teacher(String firstName, String lastName, String subject, int yearsOfTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsOfTeaching = yearsOfTeaching;
    }
}

