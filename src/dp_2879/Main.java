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
		for(int i = 0; i < 3; i++){
			line=br.readLine();
			System.out.println(line);
			if(line.isEmpty()) 
				break;
			StringTokenizer st = new StringTokenizer(line, " ");
			while(st.hasMoreTokens()) {
				strList.add(Integer.parseInt(st.nextToken()));
			}
		}
		int arrayIndexAmount=strList.get(0);
		int[] initArray= new int[arrayIndexAmount];
		int[] destinationArray= new int[arrayIndexAmount];
		int[] differenceArray= new int[arrayIndexAmount];
		int[] signArray=new int[arrayIndexAmount];
		for(int i=0; i<arrayIndexAmount;i++) {
			int arrayListStartIndex=i+1;
			initArray[i]=strList.get(arrayListStartIndex);
			destinationArray[i]=strList.get(arrayListStartIndex+arrayIndexAmount);
			differenceArray[i]= initArray[i] - destinationArray[i];
			if(differenceArray[i]<0)
				signArray[i] = -1;
			else if(differenceArray[i]>0)
				signArray[i] = 1;
			else 
				signArray[i] = 0;
			System.out.println(differenceArray[i]);

		}
		
		int changePoint=0;
		//chagePoint�� ������, �ű⼭ �ٷ� ������� ��. 
		for(int i=0; i<arrayIndexAmount;i++) {
			if(signArray[i]==0) {
				changePoint=i;
				break;
			}
			else if((i+1 != arrayIndexAmount) && (signArray[i]!=signArray[i+1])) {
				changePoint=i;
				break;
			}
			else if((i+1 != arrayIndexAmount) && (signArray[i]==signArray[i+1])) {
				changePoint++;
			}
		}
		//return�� �� i+1��.
		changePoint = changePoint + 1;
		System.out.println(changePoint);
		//���� changePoint +1 = aarayIndexAmount��� ���� ������� �Ǵ����� �Ѿ����
		//��迭�� ����������.
		for(int i = 0, j=0; i < arrayIndexAmount; i++) {
			int[] leftArray = new int[changePoint];
			int[] rightArray = new int[arrayIndexAmount - changePoint];
			if(i < changePoint) {
				leftArray[j] = initArray[i];
				System.out.println("l"+leftArray[j]);
				
			}

			else {
				if(i == changePoint)
					j=0;
				rightArray[j] = initArray[i];
				System.out.println("r"+rightArray[j]);
			}
			
		}
			//������ �������� ��ȣ�� ���ų�, �������� ���̽�
	}

}
