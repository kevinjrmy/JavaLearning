import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class NewPlayground {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		names.push("Kevin");
		names.push("Janiel");
		names.push("Mari");
		
		System.out.println(names.remove());
		System.out.println(names.remove());
		System.out.println(names.remove());
	}

}
