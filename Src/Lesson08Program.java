import Models.Animal;

import java.util.Scanner;

public class Lesson08Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menuCalculator();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Please enter first number");
                    int a = scanner.nextInt();
                    System.out.println("Please enter second number");
                    int b = scanner.nextInt();
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println("Please enter first number");
                    int a1 = scanner.nextInt();
                    System.out.println("Please enter second number");
                    int b1 = scanner.nextInt();
                    System.out.println(a1 - b1);
                    break;
                case 3:
                    System.out.println("Please enter first number");
                    int a2 = scanner.nextInt();
                    System.out.println("Please enter second number");
                    int b2 = scanner.nextInt();
                    System.out.println(a2 * b2);
                    break;
                case 4:
                    System.out.println("Please enter first number");
                    int a3 = scanner.nextInt();
                    System.out.println("Please enter second number");
                    int b3 = scanner.nextInt();
                    if (b3 != 0) {
                        System.out.println(a3 / b3);
                    } else {
                        System.out.println("Can`t divide by zero");
                    }
                    break;
                case 5:
                    return;
            }
        }


//        Animal crocodile = new Animal("Gena", 40);
//        System.out.println(crocodile);
//
//        Animal cat = new Animal();
//        cat.name = "Murchik";
//        cat.age = 4;
//
//        System.out.println(cat);
//        User kate = new User("Kate", 24, "Java developer", false);
//        System.out.println(kate);

//        User bob = new User();
//        bob.name = "Bob";
//        bob.age = 28;
//        bob.profession = "Java developer";
//        bob.sex = true;
//
//        System.out.println(bob);


//        Object testObject = new Object();
//        System.out.println(testObject);
//        String str = testObject.getClass().getName();
//        System.out.println(str);
//
//        User tom = new User();
//        String str2 = tom.getClass().getName();
//        System.out.println(str2);
//
//        Object testObject2 = new User();
    }

    public static void menuCalculator() {
        System.out.println("Please choose action for calculation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
    }
}
