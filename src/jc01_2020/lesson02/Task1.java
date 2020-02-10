package jc01_2020.lesson02;

/*
 *
 * Какое из чисел 1, 2 или 3 введено
 * С клавиатуры вводится число. Вывести на экран какое число введено в соответствии с форматом вывода
 *
 * Формат вывода (ошибки недопустимы):
 * "Число 1"
 * "Число 2"
 * " 3"
 * "Другое число"
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeric = scanner.nextInt();
		switch (numeric){
			case 1:
				System.out.println("Число 1" + numeric );
                  break;
			case 2:
				System.out.println("Число 2" +  numeric);
                 break;
			case 3:
				System.out.println("Число 3" +  numeric);
                 break;
			default:
				System.out.println("Другое число");
		}

	}
}
