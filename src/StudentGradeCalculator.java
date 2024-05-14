import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Welcome to Student Grade Calculator: "+name);

        System.out.print("Please Enter Total Number of Your Subject : ");
        int SN = sc .nextInt();

        int[] mark = new int[SN];

        for(int i = 0; i<mark.length; i++){
            System.out.print("Enter Mark for Subject "+(i+1)+" : ");
            mark[i]=sc.nextInt();
            while (mark[i]<0||mark[i]>100){
                System.out.print("Please Enter the Correct Mark for Subject "+(i+1)+": ");
                mark[i]=sc.nextInt();
            }
        }
        int totolMarks=0;
        double average;
        String grade;
        for (int j : mark) {
            totolMarks = totolMarks + j;
        }
        average=totolMarks/SN;
        if (average>=80)
            grade="A+";
        else if (average<80&&average>=70)
            grade="A";
        else if (average<70&&average>=60)
            grade="B";
        else if (average<60&&average>=50)
            grade="C";
        else if (average<50&&average>=40)
            grade="D";
        else if (average<40&&average>=33)
            grade="E";
        else
            grade="F";
        System.out.println(name+"'s Total Marks: "+totolMarks);
        System.out.println("Average Percentage : "+average);
        System.out.println("Grade : "+grade);
    }
}
