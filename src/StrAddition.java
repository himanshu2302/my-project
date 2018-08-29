
public class StrAddition {
public static void main(String[] args) {
	String str="Thish fla689ebvac98b dk7bc89";
	char[] n=str.toCharArray();
	int sum=0;
	for(int i=0;i<n.length;i++) {
		if(n[i]>='0'&&n[i]<='9') {
			sum=sum+(char)(n[i]);
		}
	}
	System.out.println("Sum is : "+sum);
}
}
