package day5_task;
import java.util.*;

class Student {
    int id;
    String name;
    String grade;
    Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    int getId() {
        return id;
    }
    String getName() {
        return name;
    }
    String getGrade() {
        return grade;
    }
    void setName(String name) {
        this.name = name;
    }
    void setGrade(String grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}
class studentsmanagement {
    Map<Integer, Student> studentsMap = new HashMap<>();
    List<Student> studentsList = new ArrayList<>();
    void addStudent(Student student) {
        studentsMap.put(student.getId(), student);
        studentsList.add(student);
    }
    void viewStudents() {
        studentsList.forEach(System.out::println);
    }
    Student searchStudentById(int id) {
        return studentsMap.get(id);
    }
    List<Student> searchStudentByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : studentsList) {
            if (student.getName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }
        return result;
    }
    void updateStudent(int id, String name, String grade) {
        Student student = studentsMap.get(id);
        if (student != null) {
            student.setName(name);
            student.setGrade(grade);
        }
    }
    void removeStudent(int id) {
        Student student = studentsMap.remove(id);
        if (student != null) {
            studentsList.remove(student);
        }
    }
    void sortStudentsByName() {
        studentsList.sort(Comparator.comparing(Student::getName));
    }
    void sortStudentsByGrade() {
        studentsList.sort(Comparator.comparing(Student::getGrade));
    }
}

public class students_management {
    public static void main(String[] args) {
    	studentsmanagement sm = new studentsmanagement();

        sm.addStudent(new Student(1, "Alice", "A"));
        sm.addStudent(new Student(2, "Bob", "B"));
        sm.addStudent(new Student(3, "Charlie", "C"));
        System.out.println("Viewing all students:");
        sm.viewStudents();
        System.out.println("\nSearching for student by ID (ID: 2):");
        System.out.println(sm.searchStudentById(2));
        System.out.println("\nSearching for student by name (Name: Charlie):");
        sm.searchStudentByName("Charlie").forEach(System.out::println);
        System.out.println("\nUpdating student information (ID: 2):");
        sm.updateStudent(2, "Bobby", "A+");
        sm.viewStudents();
        System.out.println("\nRemoving student (ID: 1):");
        sm.removeStudent(1);
        sm.viewStudents();
        System.out.println("\nSorting students by name:");
        sm.sortStudentsByName();
        sm.viewStudents();
        System.out.println("\nSorting students by grade:");
        sm.sortStudentsByGrade();
        sm.viewStudents();
    }
}
