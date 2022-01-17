public class AverageScore
{
    public static void main(String[] args)
    {
        int[] scores = {61, 57, 95, 85, 75, 65, 44, 66, 90, 32};
        int sum = 0;
        for (int score:scores)
        {
            sum += score;
        }
        double avg = sum/scores.length;
        System.out.println(avg);
    }
}