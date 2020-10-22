import java.util.Scanner;

public class GradesOfStudentsQ2 {
	public static void main(String args[]) {
		int numStudents, count = 1,sum=0;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students:");
		numStudents = sc.nextInt();
		while (count <= numStudents) {
			System.out.print("enter the grade of student " + count + ":");
			int grade = sc.nextInt();
			if (grade > 100) {
				System.out.println("Invalid grade, try again...");
			} else {
				count++;
				sum+=grade;
			}

		}
		avg=sum/numStudents;
		System.out.print(avg);
			sc.close();
		}
	}


