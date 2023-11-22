
package studentGradeCalculator;
import java.util.Scanner;

public class sudentGradeCalc {
    
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number of subjects:");
    int numSubjects=sc.nextInt();
    
     int totalMarks=0;
     for(int i=1; i<=numSubjects; i++){
         System.out.print("marks obtained in subject "+i+" :");
         int marks=sc.nextInt();
         totalMarks+=marks;
     }
     
     double avgPercentage= (double)totalMarks/numSubjects;
     
     String grade;
     if(totalMarks>=90){
         grade="O";
     }
     else if(totalMarks>=80){
         grade="A";
     }
     else if(totalMarks>=70){
         grade="B";
     }
     else if(totalMarks>=60){
         grade="C";
     }
     else if(totalMarks>=50){
         grade="D";
     }
     else{
         grade="F";
     }
     
     System.out.println("Total Marks: "+totalMarks);
     System.out.println("average percentage: "+avgPercentage);
     System.out.println("Grade: "+grade);
    }
}
