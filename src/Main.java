import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        EducationCenter educationCenter = new School("Star", "Russia", LocalDate.of(2000, 10, 7)) {
        };
        EducationCenter educationCenter1 = new University("SpaceXLL", "Norway", LocalDate.of(2017, 3, 4));
        EducationCenter educationCenter2 = new College("N24 mektep", "Kyrgyzstan", LocalDate.of(2000, 4, 8));

        Student[] students = {new Student("Samat", "Islamovich", "male", LocalDate.of(2020, 8, 1), educationCenter1),
        new Student("Erkin", "Ben", "male", LocalDate.of(2020, 8, 1), educationCenter1),
        new Student("Sabina", "Cholponbaeva", "female", LocalDate.of(2020, 8, 1), educationCenter1),
        new Student("Adelya", "Sagynbekova", "female", LocalDate.of(2015, 10, 8), educationCenter),
        new Student("Uuljan", "Bolotmambetova", "female", LocalDate.of(2004, 3, 5), educationCenter2),
        new Student("Kanat", "Kadyrov", "male", LocalDate.of(2020, 8, 1), educationCenter1),
        new Student("Yasha", "Yakov", "male", LocalDate.of(2015, 10, 8), educationCenter),
        new Student("Nurai", "Kadyrbekova", "female", LocalDate.of(2020, 8, 1), educationCenter1),
        new Student("Ali", "Muratov", "male", LocalDate.of(2015, 10, 8), educationCenter),
        new Student("Madina", "Saadievna", "female", LocalDate.of(2004, 3, 5), educationCenter2)};



        for (Student student : students) {
            System.out.println("Name: " + student.name + " " + student.surname);
            System.out.println("Gender: " + student.gender);
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}

