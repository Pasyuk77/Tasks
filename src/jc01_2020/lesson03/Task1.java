package jc01_2020.lesson03;

/*
 *
 * С клавиатуры вводится целое число. Найти его наибольшую цифру
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
		long max ;
    	input = input % 10;
		max = input / 10;
		while (input > 0) {
			if (input % 10 > max)
				max = input % 10;
			input = input / 10;
		}
		System.out.println(max);
	}
}




