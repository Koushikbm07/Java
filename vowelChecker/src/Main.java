
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(2,1));
		
		int a=5,b=6,c=5;
		int[] ar= {5,6,7,8,9};
		a+=b;
		
//		for(int ch :ar ) {
//			if(7<a && (4&c)<b)
//			{
//				break;
//			}
//			b=16^c;
//			}
		c=15+b;
//		if((13+a)<(8+b)){
//			if((b+a+8)<(a+c+b)) {
//				if((a+b)< (10-a)) {
//					a+=12;
//				}
//				a=c+10+b;
//			}
//			else {
//				b=10+a;
//			}
//		}
		System.out.println(a+b);
	
	}
	
	static int fun(int a , int b) {
		if((5-a)>(a-b) && b<a) {
			a=a+a+1;
			b+=2;
			b=2+a+b;
			return b-fun(b+1,b)+1;
		}
		return a;
	}

}
