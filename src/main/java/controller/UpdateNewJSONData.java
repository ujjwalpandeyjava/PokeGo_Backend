package controller;

import java.util.Scanner;

public class UpdateNewJSONData {

	// Change this main to a method after successful development
	public static void main(String[] args) {
		System.out.println(
				"It will take 3 minutes. \nAre you sure you want to override old files and data in it?\n Enter \"Y\" to confirm and \"N\" to cancel:");
		Scanner scan = new Scanner(System.in);
		String writeNewData = scan.next();
		System.out.println(writeNewData.equalsIgnoreCase("Y") ? whichFunctionToUse() : "APIs data Update cancelled.");

		scan.close();
	}

	static String whichFunctionToUse() {

		return UpdateFunctionJackson.fetchNewData();
		
		/*System.out.print("Use \n1). JSON-Simple\n2). JackSon (default) \nEnter 1 or 2: - ");
		Scanner scan = new Scanner(System.in);
		String whichFunctionTouse = scan.next();
		if (whichFunctionTouse.equalsIgnoreCase("1")) {
			scan.close();
			return UpdateFunction.fetchNewData();
		} else {
			scan.close();
			return UpdateFunctionJackson.fetchNewData();
		}*/
	}
}