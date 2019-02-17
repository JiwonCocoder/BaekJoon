package stack_10828;

import java.io.*;
import java.util.*;

public class Main {
	static int topPointer=-1; 
	public static int is_stackEmpty(int[] numArray) {
		if (topPointer==-1) {
			return 1;
		}
		else 
			return 0; 
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		System.out.println(line);

	}

}
