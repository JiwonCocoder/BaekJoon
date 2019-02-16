package maxheap_11279;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	static int heaplength=0;
	public static int currentIndex=-1;

	public static int extractMaxHeap(int[] numberArray) {
		int temp=numberArray[0];
		numberArray[0]=numberArray[Main.currentIndex];
		numberArray[Main.currentIndex--]=0;
		MAX_HEAPIFY(numberArray, 0);
		return temp;
	}
	public static void buildMaxHeap(int[] numberArray,int flagNumber) {
		//first element
			numberArray[++Main.currentIndex]=flagNumber;
			for(int i=(Main.currentIndex+1)/2-1;i>=0;i--) {
				MAX_HEAPIFY(numberArray,i);
			}			
			
	}
	public static void MAX_HEAPIFY(int[] numberArray,int i) {
		int left=LEFT(i);
		int right=RIGHT(i);
		int largest=i;
		int temp=numberArray[i];
		if(left<=Main.currentIndex && numberArray[left]>numberArray[i])
			largest=left;
		if(right<=Main.currentIndex && numberArray[right]>numberArray[i])
			largest=right;
		if(largest!=i) {
			numberArray[i]=numberArray[largest];
			numberArray[largest]=temp;
			MAX_HEAPIFY(numberArray,largest);
		}
	}
	public static int LEFT(int i) {
		return 2*i;
	}
	public static int RIGHT(int i) {
		return 2*i+1;
	}
	public static int checknumberArrayEmpty(int[] numberArray) {
		for(int i=0;i<numberArray.length;i++) {
			if(numberArray[i]!=0)
				return ++i;
		}
			return 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		//String[] s = br.readLine().split(" ");
		//StringTokenizer st = new StringTokenizer(br.readLine());
		//int count= Integer.parseInt(s[0]);
		String line;
		while((line=br.readLine())!=null)
		int count= Integer.parseInt(st.nextToken());
		int[] numberArray=new int[count];
		int flagNumber=0;
		for(int i=1;i<=count;i++) {
			//flagNumber=Integer.parseInt(s[i]);
			flagNumber=Integer.parseInt(st.nextToken());

			int numberPrinted=0;
			
			if(flagNumber==0) {
				if(Main.currentIndex!=-1)
					numberPrinted=extractMaxHeap(numberArray);
				System.out.println(numberPrinted);
			}
			else {
				buildMaxHeap(numberArray, flagNumber);
			}
			
		}
		br.close();
	}

}