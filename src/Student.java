import java.time.LocalDate;

public class Student implements Study {

    public String name;
    public String surname;
    public String gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenters;


    public Student() {
    }

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenters) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenters = educationCenters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenters() {
        return educationCenters;
    }

    public void setEducationCenters(EducationCenter educationCenters) {
        this.educationCenters = educationCenters;
    }

    @Override
    public void getStudentsEducationCenter() {
        System.out.println(getName()+"----studies"+" "+educationCenters.getName());
    }

    @Override
    public void getStudentsStudyingYear() {

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", educationCenters=" + educationCenters +
                '}';
    }
}