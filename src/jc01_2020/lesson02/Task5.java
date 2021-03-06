package jc01_2020.lesson02;

/*
 *
 * Определить, является ли год, который ввел пользователем, високосным или невисокосным.
 *
 * Високосные года делятся нацело на 4.
 * Однако из этого правила есть исключение: столетия, которые не делятся нацело на 400, високосными не являются.
 *
 * Формат вывода (ошибки недопустимы):
 * "Високосный"
 * "Обычный"
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if (year % 4 ==0) {
		 if ((year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Високосный");
		}
	} else
			System.out.println("Обычный");
	}
}
