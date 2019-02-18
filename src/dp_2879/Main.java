package dp_2879;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int count=0;
		ArrayList<Integer> strList =new ArrayList<Integer>();
		while((line=br.readLine())!=null){
			System.out.println(line);
			if(line.isEmpty()) 
				break;
			StringTokenizer st = new StringTokenizer(line, " ");
			while(st.hasMoreTokens()) {
				strList.add(Integer.parseInt(st.nextToken()));
			}
		}
		System.out.println("here");

		int arrayIndexAmount=strList.get(0);
		int[] initArray= new int[arrayIndexAmount];
		int[] destinationArray= new int[arrayIndexAmount];
		for(int i=0; i<arrayIndexAmount;i++) {
			int arrayListStartIndex=i+1;
			initArray[i]=strList.get(arrayListStartIndex);
			destinationArray[i]=strList.get(arrayListStartIndex+arrayIndexAmount);
		}
				

	}

}
