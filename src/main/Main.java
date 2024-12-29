package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1;
        char operation;
        String res = "";
        while (true) {
            if (res.equals("Error") || res.isEmpty()) {
                System.out.print("Введите первый операнд: ");
                operand1 = scanner.nextInt();
            } else {
                operand1 = Integer.parseInt(res);
            }
            System.out.print("Введите оператор: ");
            operation = scanner.next().charAt(0);
            if (operation == 'C') {
                System.out.println("Результат обнулен.");
                res = "Error";
            } else if (operation == 's') {
                System.out.println("Завершение работы.");
                return;
            } else {
                res = Calculate(operand1, scanner, operation);
            }
            if (!res.equals("Error")) {
                System.out.println("Результат: " + res);
            }
        }
    }

    private static String Calculate(int operand1, Scanner scanner, char operation) {
        switch (operation) {
            case ('+'):
                System.out.print("Введите второй операнд: ");
                operand1 = operand1 + scanner.nextInt();
                break;
            case ('-'):
                System.out.print("Введите второй операнд: ");
                operand1 = operand1 - scanner.nextInt();
                break;
            case ('*'):
                System.out.print("Введите второй операнд: ");
                operand1 = operand1 * scanner.nextInt();
                break;
            case ('/'):
                System.out.print("Введите второй операнд: ");
                try {
                    operand1 = operand1 / scanner.nextInt();
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка! Деление на 0 невозможно!");
                    return "Error";
                }
            default:
                System.out.println("Такого оператора не существует!");
                return "Error";
        }
        return Integer.toString(operand1);
    }
}

