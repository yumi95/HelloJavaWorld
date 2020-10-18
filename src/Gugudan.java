import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		int [] result = new int[9];
		System.out.println("구구단 중 출력할 단을 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i = 0; i < result.length; i++) {
			result[i] = num * (i+1);
		}
		
		if(num < 2) {
			System.out.println("숫자가 너무 적습니다. 2단부터 입력 가능합니다.");
		}
		else if(num > 9) {
			System.out.println("숫자가 너무 큽니다. 9단까지만 입력 가능합니다.");
		}
		else {
			for(int i = 0; i < result.length; i++) {
				System.out.println(num+" x "+(i+1)+" = "+result[i]);
			}
		}
	}
}

