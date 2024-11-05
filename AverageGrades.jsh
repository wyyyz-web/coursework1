// AverageGrades.jsh
public class AverageGrades {

    public static int[] average_grades(int grades[][], int weights[]) {
        int numStudents = grades.length;
        int numAssessments = weights.length;
        int[] weightedAverages = new int[numStudents];
        
        // Calculate weighted average for each student
        for (int i = 0; i < numStudents; i++) {
            int totalGrade = 0;
            for (int j = 0; j < numAssessments; j++) {
                totalGrade += grades[i][j] * weights[j];  // Multiply grade by weight
            }
            weightedAverages[i] = totalGrade / 100;  // Divide by 100 and round down
        }
        
        return weightedAverages;
    }
}
