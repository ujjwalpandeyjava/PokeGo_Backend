package jsonData;

import java.util.Scanner;

public class UpdateJSONData {

	public static void main(String[] args) {
		System.out.println(
				"Are you sure you want to override old files and data in it?\n Enter \"Y\" to confirm and \"N\" to cancel:");
		Scanner scan = new Scanner(System.in);
		String writeNewData = scan.next();
		System.out.println(
				writeNewData.equalsIgnoreCase("Y") ? UpdateFunction.fetchNewData() : "Updating API data canceled.");
		scan.close();
	}

}
