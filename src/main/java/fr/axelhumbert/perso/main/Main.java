package fr.axelhumbert.perso.main;

import java.util.Scanner;

public class Main {

  private enum Parameter {
    TERMINAL, GRAPHICAL, WEB
  }

  private static void usage() {
    System.out.println("""
            USAGE : java -jar LessOrPlus.jar parameter
            -terminal to play in a terminal
            -graphical to play in a window""");
  }

  public static void main(String[] args) {
    if (args.length != 1) {
      usage();
      return;
    }

    var param = args[0].substring(1).toUpperCase();
    switch (param) {
      case Parameter.TERMINAL :
    }
    var scanner = new Scanner(System.in);

    System.out.println("Give me the max number to find : ");

    var max = scanner.nextInt();
    var min = 1;
    var researchedNumber = (int) (Math.random() * (max - min));

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
