package print_11719;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String line;
		int count=0;
		ArrayList<String> strList =new ArrayList<String>();
		while((line=br.readLine())!=null){
			if(!line.isEmpty()) {
				if(count<100) {
					strList.add(line);
					count++;
				}
				else break;
			}
			else break;
		}
			//strList.add(line);
			/*if(line.isEmpty()) 
				break;
			else {
				strList.add(line);
			}
			line=br.readLine();*/		
		for(int i=0; i < strList.size() ; i++) {
			String val=(String)strList.get(i);
			System.out.println(val);
		}
	}
}
