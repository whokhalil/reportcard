package student.report.card;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of Student: ");
        int numOfStudents = scan.nextInt();

        Student[] students = new Student[numOfStudents];
        int count = 0;
        while (count < numOfStudents) {
            addStudents(scan, students, count);
            count++;
        }

        print(students);

    }

    private static void print(Student[] students) {
        // print out
        for(int i=0; i<students.length;i++) {
            System.out.println(students[i]);
        }
    }

    private static void addStudents(Scanner scan, Student[] students, int count) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
//            scan.next();
        System.out.println("Enter name of the student: ");
        s.setName(sc.nextLine());//s.setName("MUKUL");
        s.setId("sID: "+count);
        Subject[] subjects = addSubjects(scan);
        s.setSubjects(subjects);
        s.calculatePercentage();
        students[count] = s;
    }

    private static Subject[] addSubjects(Scanner scan) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        Subject[] subjects = new Subject[s.nextInt()];

        for (int i=0;i<subjects.length;i++){
            Subject subject = new Subject();
            System.out.println("Enter Subject name: ");
            subject.setName(s.nextLine()+s.next());//subject.setName("sub-"+i+"");

            System.out.println("Enter marks: ");
            int marks = subject.setMarks(s.nextInt());

            int total = 0;
            total += marks;
           // subject.getPercentage(total*100 / total);

            subjects[i] = subject;
        }
        return subjects;
    }
}
