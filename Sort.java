package BE5day7;

import java.util.ArrayList;

public class Sort {

	public static void sortArray(int[] startArray) {
		int low = 0;
		int mid = 0;
		int high = startArray.length - 1;
		while (mid < high) {
			if (startArray[mid] == 0) {
				int num = startArray[mid];
				startArray[mid] = startArray[low];
				startArray[low] = num;
				low++;
				mid++;
			} else if (startArray[mid] == 2) {
				int num = startArray[mid];
				startArray[mid] = startArray[high];
				startArray[high] = num;
				high--;

			} else {
				mid++;
			}
		}

	}

	public static void main(String[] args) {
		int[] array = { 0, 1, 2, 1, 2, 0, 2 };
		sortArray(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

//public class Sort {	
//	public static void main(String[] args) {
//		int[] startArray = { 0, 1, 2, 1, 0 };
//		ArrayList<Integer> arrayOfZero = new ArrayList<>();
//		ArrayList<Integer> arrayOfOne = new ArrayList<>();
//		ArrayList<Integer> arrayOfTwo = new ArrayList<>();
//
//		for (int i = 0; i < startArray.length; i++) {
//			if (startArray[i] == 0) {
//				arrayOfZero.add(startArray[i]);
//			}
//			else if (startArray[i] == 1) {
//				arrayOfOne.add(startArray[i]);
//			}
//			else {
//				arrayOfTwo.add(startArray[i]);
//			}
//
//		}
//		ArrayList<Integer> finalArray = new ArrayList<>();
//		finalArray.addAll(arrayOfZero);
//		finalArray.addAll(arrayOfOne);
//		finalArray.addAll(arrayOfTwo);
//		for(int i = 0; i<finalArray.size(); i++) {
//			System.out.print(finalArray.get(i));
//		}
//	}
//}

}
