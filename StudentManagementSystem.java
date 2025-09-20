import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args) {
        List<Student> allStudents=new ArrayList<>();

        Student s1=new Student(101,"naim","cs");
        Student s2=new Student(102,"oasi","math");
        Student s3=new Student(103,"mahi","physics");
        Student s4=new Student(104,"akhar","swe");
        Student s5=new Student(105,"rifat","sociology");

        allStudents.add(s1);
        allStudents.add(s2);
        allStudents.add(s3);
        allStudents.add(s4);
        allStudents.add(s5);

        System.out.println("all students (arraylist):");
        for (Student s:allStudents) {
            System.out.println(s);
        }

        Student s6=new Student(106,"fiona davis","biology");
        allStudents.add(2,s6);
        System.out.println("\nafter adding fiona at index 2:");
        for (Student s:allStudents) {
            System.out.println(s);
        }

        allStudents.remove(s4);
        System.out.println("\nafter removing diana:");
        for (Student s:allStudents) {
            System.out.println(s);
        }

        Set<Student> courseEnrollment=new HashSet<>();
        courseEnrollment.add(s1);
        courseEnrollment.add(s2);
        courseEnrollment.add(s3);

        boolean added=courseEnrollment.add(new Student(101,"alice johnson","computer science"));
        System.out.println("\ncourse enrollment (hashset):");
        for (Student s:courseEnrollment) {
            System.out.println(s);
        }
        if (added) {
            System.out.println("\ntrying to add duplicate alice: added");
        } else {
            System.out.println("\ntrying to add duplicate alice: not added (duplicate)");
        }

        if (courseEnrollment.contains(s2)) {
            System.out.println("is bob enrolled? true");
        } else {
            System.out.println("is bob enrolled? false");
        }

        System.out.println("\nnote: hashset does not guarantee order, unlike arraylist.");

        Map<Integer,Student> studentMap=new HashMap<>();
        for (Student s:allStudents) {
            studentMap.put(s.getStudentId(),s);
        }

        int lookupId=103;
        Student foundStudent=studentMap.get(lookupId);
        System.out.println("\nlookup student with id "+lookupId+":");
        if (foundStudent!=null) {
            System.out.println(foundStudent);
        } else {
            System.out.println("student not found.");
        }
    }
}
