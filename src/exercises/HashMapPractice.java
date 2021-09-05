package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<Integer, String> classRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer sID = 0;
        String studentName;
        System.out.println("Enter your students ID (or ENTER to finish): ");
//        do {
//            System.out.println("Student ID: ");
//            sID = input.nextInt();
//
//            if (!(sID.equals(0) ? null)) {
//                System.out.println("Student Name: ");
//                String studentName = input.nextLine();
//                students.put(sID, studentName);
//
//                input.nextInt();
//            }
//        } while(!(sID.equals(0) ? null));
        do {
            System.out.print("Student: ");
            studentName = input.nextLine();

            if (!studentName.equals("")) {
                System.out.print("ID: ");
                Integer studentID = input.nextInt();
                classRoster.put(studentID, studentName);

                input.nextLine();
            }
        } while(!studentName.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
