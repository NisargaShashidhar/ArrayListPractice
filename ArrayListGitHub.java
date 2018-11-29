import java.util.*;

public class ArrayListGitHub{
	public static void main(String[]args){
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10,11,12,13,14,15,16,17,18,19));

		System.out.println(list1);
		System.out.println(list2);

		ArrayList<Integer> combined = combine(list1, list2);
		System.out.println(combined);

		System.out.println(printList(list1));
		ArrayList<Integer> noDuplicates = removeDuplicates(combined);
		System.out.println(printList(noDuplicates));
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

	public static String printList(ArrayList<Integer> list){
		String returnStatement = "";
		for(int x = 0; x < list.size(); x++){
			if(x == list.size()-1)
				returnStatement += list.get(x);
			else
				returnStatement += list.get(x)+", ";
		}
		return returnStatement;
	}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> input){
		ArrayList<Integer> output = new ArrayList<Integer>();
		int x = 0;
		boolean duplicate = false;
		for(int i = 0; i < input.size(); i++){
			duplicate = false;
			for(int j = 0; j < output.size(); j++){
				if(output.get(j) == input.get(i)){
					duplicate = true;
					x = j;
					break;
				}
			}
			if(duplicate == false)
				output.add(input.get(i));
			else
				output.remove(x);
		}
		return output;
	}
}
