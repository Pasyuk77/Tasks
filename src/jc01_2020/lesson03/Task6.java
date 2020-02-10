package jc01_2020.lesson03;

/*
 *
 * Вывести на экран "прямоугольник", образованный из двух видов символов.
 * Контур прямоугольника должен состоять из одного символа, а "заливка" - из другого.
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int horizontal;// = scanner.nextInt();
		int vertical;//= scanner.nextInt();
		int point;
		for (horizontal = 0; horizontal < 5; horizontal++) {
			if (horizontal == 0 || horizontal == 4)
				for (vertical = 0; vertical < 10; vertical++)
					System.out.print("o");

			else {
				System.out.print("o");
				for (vertical = 1; vertical < 9; vertical++)
					System.out.print("-");
				System.out.print("o");

			}


		}
	}

}




