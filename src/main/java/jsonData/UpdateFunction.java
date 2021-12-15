package jsonData;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UpdateFunction {
	public static String fetchNewData() {
		String returnString = "";
		try {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
			String newDataDate = dtf.format(LocalDateTime.now());
			returnString = "Data Updated successfully. New Data saved in history directory of file named: "
					+ newDataDate;

			String currentPath = new File("").getCanonicalPath();
			String dirJson = currentPath + "\\src\\main\\java\\jsonData";	//add JSON file to use.
			String dirHistoryFolder = currentPath + "\\src\\main\\java\\jsonData\\history\\" + newDataDate;	//to create new directory
			String dirHistoryJson = dirHistoryFolder;	//add JSON file in this folder as history.

			File f = new File(dirHistoryFolder);

			boolean bool = f.mkdir();
			System.out.println((bool) ? "New file directory created" : "Error");
			
			
			
			
			
//			File file = new File(newDataDate);
//			FileWriter file = new FileWriter(null);

		} catch (Exception e) {
			e.fillInStackTrace();
			returnString = "Data not updated.\n There is a problem in the code.";
		}
		return returnString;
	}
}
