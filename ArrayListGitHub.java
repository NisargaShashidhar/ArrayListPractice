import java.util.*;

public class ArrayListGitHub{
	public static void main(String[]args){
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10,12,13,14,15,16,17,18,19,20));
	}

	public static ArrayList<Integer> combine(ArrayList<Integer> listOne, ArrayList<Integer> listTwo){
		ArrayList<Integer> combinedList = new ArrayList<Integer>();
		for(int x = 0; x < listOne.size(); x++){
			combinedList.add(listOne.get(x));
		}
		for(int x = 0; x < listTwo.size(); x++){
			combinedList.add(listTwo.get(x));
		}
		return combinedList;
	}
}