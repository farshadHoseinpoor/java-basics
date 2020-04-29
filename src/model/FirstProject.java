package model;

import java.util.Scanner;

public class FirstProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** please enter max number of members: ***");
        int number = scanner.nextInt();
        int[] ids = new int[number];
        String[] names = new String[number];
        String[] families = new String[number];
        String[] ages = new String[number];          //change int to String for prevent of exception
        boolean[] exists = new boolean[number];
        boolean repeat = true;
        output:
        for (int j = 1; j <= number; j++) {
            while (repeat) {
                System.out.println("1:Add Member");
                System.out.println("2:Delete Member");
                System.out.println("3:Edit Member");
                System.out.println("4:Show Member");
                System.out.println("5:Exit");
                System.out.println("*** please enter number of your choice: ***");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        if (j < number) {
                            scanner = new Scanner(System.in);
                            ids[j] = j;
                            System.out.print("name:");
                            String name = scanner.nextLine();
                            names[j] = name;
                            System.out.print("family:");
                            String family = scanner.nextLine();
                            families[j] = family;
                            System.out.print("age:");
                            String age = scanner.nextLine();   //change int to String for prevent of exception
                            ages[j] = age;
                            exists[j] = true;
                            System.out.println("*** ID of user = " + j + " ***");
                            continue output;
                        } else {
                            System.out.println("*** Out of designated capacity ***");
                            break;
                        }
                    case 2:
                        scanner = new Scanner(System.in);
                        System.out.println("*** please enter ID: ***");
                        int integerDeleteId = scanner.nextInt();
                        if (integerDeleteId < number) {
                            exists[integerDeleteId] = false;
                            System.out.println("*** user number " + integerDeleteId + " deleted ***");
                            break;
                        } else System.out.println("*** ID not found ***");
                        break;
                    case 3:
                        scanner = new Scanner(System.in);
                        System.out.println("*** please enter ID: ***");
                        int integerEditId = scanner.nextInt();
                        if (integerEditId < number && exists[integerEditId] == true) {
                            System.out.print("name:");
                            String editedName = scanner.next();
                            names[integerEditId] = editedName;
                            System.out.print("family:");
                            String editedFamily = scanner.next();
                            families[integerEditId] = editedFamily;
                            System.out.print("age:");
                            String editedAge = scanner.next();
                            ages[integerEditId] = editedAge;     //change int to String for prevent of exception
                            System.out.println("*** user number " + integerEditId + " edited ***");
                            break;
                        } else System.out.println("*** ID not found or Deleted ***");
                        break;
                    case 4:
                        scanner = new Scanner(System.in);
                        System.out.println("*** please enter ID: ***");
                        int integerShowId = scanner.nextInt();
                        if (integerShowId < number && exists[integerShowId] == true) {

                            System.out.println("name -> " + names[integerShowId]);
                            System.out.println("family -> " + families[integerShowId]);
                            System.out.println("age -> " + ages[integerShowId]);
                            continue;
                        } else {
                            System.out.println("*** ID not found or Deleted ***");
                            break;
                        }
                    case 5:
                        repeat = false;
                        break;
                    default:
                        System.out.println("*** please enter a valid number ***");
                }
            }
        }
    }
}
