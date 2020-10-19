import java.util.Scanner;

public class Gugudanfinish {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("x, y 입력(x의 y단까지 출력합니다.) : ");
		// String으로 입력을 받는다.
		String inputValue = scanner.nextLine(); 
		
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		int[] result = new int[second];

		for(int i = 0; i < result.length; i++) {
			result[i] = (i + 1) * first;
		}
		
		if(first <= 0 || second <= 0) {
			System.out.println("0 미만의 수는 입력할 수 없습니다.");
		}
		else {
			for(int i = 0; i < result.length; i++) {
				System.out.println(first+" x "+(i + 1)+" = "+result[i]);	
			}
		}	
	}
}


