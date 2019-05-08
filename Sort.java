class Sort {
	public static void main(String args[]) {
		int num[] = {50,60,10,-1,13} ;
		int a, b, t ;
		int i ;
		int size ;
		size = 5 ;

		for(i=0;i<5;i++)
		   System.out.println("The original array is : " + num[i] ) ;

		for(a=1;a<size;a++)
			for(b=size-1;b>=a;b--) {
				if(num[b-1] > num[b]) {
					t = num[b-1] ;
					num[b-1] = num[b] ;
					num[b] = t ;
				}
			}
			for(i=0;i<5;i++)
			   System.out.println("The sorted array is : " + num[i] );
	}
}