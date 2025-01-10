import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Integer> gradeOccurrence = new HashMap<String, Integer>();
        gradeOccurrence.put("A", 0);
        gradeOccurrence.put("B", 0);
        gradeOccurrence.put("C", 0);
        gradeOccurrence.put("D", 0);
        String grade;
        for (int i = 0; i<n; i++){
            grade = scanner.nextLine();
            gradeOccurrence.put(grade, gradeOccurrence.get(grade)+1);
        }

        System.out.println(gradeOccurrence.get("D") + " " + gradeOccurrence.get("C") + " " + gradeOccurrence.get("B") + " "+ gradeOccurrence.get("A"));
    }
}