
public class Armstrong {
	
	
	
	int getArmstrong(int n) {
		int n1=n;
		int res=0;
		int count=0;
		int sum=0;
		while(n1!=0) {
			n1=n1/10;
			count++;
		}
		while(n!=0) {
			int rem=n%10;
			res=(int) Math.pow(rem, count);
			sum=sum+res;
			n=n/10;
		}
		
		return sum;
	}
}
