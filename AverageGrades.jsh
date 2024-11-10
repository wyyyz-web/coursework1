int[] average_grades(int grades[][], int weights[]) {
    int numStudents = grades.length;
    int numComponents = weights.length;
    int[] averages = new int[numStudents];

    for (int i = 0; i < numStudents; i++) {
        int weightedSum = 0;
        for (int j = 0; j < numComponents; j++) {
            weightedSum += grades[i][j] * weights[j];
        }
        averages[i] = weightedSum / 100;
    }

    return averages;
}
int[] result = average_grades(new int[][]{{51, 83, 28}, {0, 38, 95}}, new int[]{30, 40, 30});
System.out.println(java.util.Arrays.toString(result)); // 应输出 [56, 43]

