import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while (true) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter three grades: ");
      double grade1 = in.nextDouble();
      double grade2 = in.nextDouble();
      double grade3 = in.nextDouble();

      double average = (grade1 + grade2 + grade3) / 3;

      if (average >= 90 && average > 89.9) {
        System.out.println("A: Excellent Job!");
      } else if (average >= 80 && average > 79.9) {      
        System.out.println("B: Good Job!");
      } else if (average >= 70 && average > 69.9) {
        System.out.println("C: Average, study more.");
      } else if (average >= 60 && average > 59.9) {
        System.out.println("D: Need to study.");
      } else if (average < 60 && average > 0) {
        System.out.println("F: Failed, study harder next time.");
      }
      System.out.println();
    }
  }   
}