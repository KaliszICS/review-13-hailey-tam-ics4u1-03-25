
import java.util.HashMap;
import java.util.ArrayList;
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void swap(ArrayList<String> arr, int num1, int num2) {
		String temp1 = arr.get(num1);
		String temp2 = arr.get(num2);
		arr.set(num1,temp2);
		arr.set(num2, temp1);
	}

	public static ArrayList<Double> createArrayList(double[] arr){
		ArrayList<Double> arrNew = new ArrayList<Double>();
		for (int i = 0; i < arr.length; i ++){
			arrNew.add(arr[i]);
		}
		return arrNew;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages){
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for (int i = 0; i < names.length; i++){
			map.put(names[i], ages[i]);
		}
		return map;
	}

	public static void increaseAge(HashMap<String,Integer> age, String name){
		Integer currentAge = age.get(name);
		Integer newAge = currentAge + 1;
		age.put(name, newAge);
		}

	}
