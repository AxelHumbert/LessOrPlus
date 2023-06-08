package fr.axelhumbert.perso.main;

import java.util.Scanner;

public class Main {

  private static void usage() {
    System.out.println("USAGE : java -jar LessOrPlus.jar maxNumber");
  }

  public static void main(String[] args) {
    if (args.length != 1) {
      usage();
      return;
    }

    var max = Integer.parseInt(args[0]);
    var min = 1;
    var researchedNumber = (int) (Math.random() * (max - min));
    var scanner = new Scanner(System.in);

    System.out.println("Give me a number between " + min + " and " + max + " : ");
    var givenNumber = scanner.nextInt();

    while (givenNumber != researchedNumber) {
      if (givenNumber < researchedNumber) {
        System.out.println("It's plus !");
      } else {
        System.out.println("It's less !");
      }
      givenNumber = scanner.nextInt();
    }

    System.out.println("Congratulations ! You win and the number to search was " + researchedNumber);
    scanner.close();
  }
}
