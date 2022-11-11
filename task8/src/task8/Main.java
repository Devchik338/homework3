package task8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.print("Input num - ");
			int num = sc.nextInt();
			numArr.add(num);
		}
		int max=0;
		int min=numArr.get(0);
		int index_low = 0;
		int index_hight = 0;
		
		for(int i=0;i<numArr.size();i++) {
			if(max<numArr.get(i)) {
				max = numArr.get(i);
				index_hight = i;
			}
		}
		
		for(int j = 0; j<numArr.size(); j++) {
			if(min > numArr.get(j)) {
				min = numArr.get(j);
				index_low = j;
			}
		}
		

		System.out.printf("Result - %s", index_low + index_hight);
	
	}
}
