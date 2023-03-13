package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution12906 {
	public int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (i == 0 || arr[i] != arr[i - 1]) { // 현재 원소가 이전 원소와 다를 때만 리스트에 추가
				list.add(arr[i]);
			}
		}

		int[] answer = new int[list.size()]; // 리스트를 배열로 변환하여 리턴
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}
}

public class Test_12906 {
	public static void main(String[] args) {
		Solution12906 sol = new Solution12906();
		int arr[] = new int[] { 1, 1, 3, 3, 0, 1, 1 };
		System.out.println(Arrays.toString(sol.solution(arr)));

	}

}
