import java.util.Scanner;

public class Task2 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of subjects");
        int subjects = s.nextInt();
        int marks;
        int totalmarks = 0;
        double avgpercentage;
        String grade="";
        for(int i=1;i<=subjects;i++){
            System.out.println("enter the no."+i+" "+"subject marks");
            marks = s.nextInt();
            if(marks>100){
                System.out.println("less thn 100 mark are allowed");
                return;
            }
            totalmarks = totalmarks+marks;

        }
        avgpercentage = (double)totalmarks/(subjects*100)*100;
        if(avgpercentage>=90)
          grade = "A";
         else if(avgpercentage>=80)
          grade = "B";
          else if(avgpercentage>=70)
          grade = "C";
         else if(avgpercentage>=60)
          grade = "D";
          else
          grade = "F";
          System.out.println("total marks"+totalmarks);
          System.out.println(String.format("average percentage %.2f",avgpercentage));
          System.out.println("grade"+grade);
     }
}
