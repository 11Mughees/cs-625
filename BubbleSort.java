class BubbleSort {
  public static void main(String args[]) {
	int nums[] = {10,25,5,9,31,40,14,8,52,1} ;
	int a , b , i , temp = 0 ;
	int size = 10 ;

	for(i=0 ; i<10 ; i++)
	  System.out.println("THE ORIGINAL ARRAY IS = " + nums[i] ) ;

	for(a=1 ; a<size ; a++)
	   for(b=size-1 ; b>=a ; b--) {
	      if(nums[b-1] > nums[b]) {
	         temp = nums[b-1] ;
		 nums[b-1] = nums[b] ;
		 nums[b] = temp ;
		}
	}
	for(i=0 ; i<10 ; i++)
	System.out.println("THE SORTED FORM OF ARRAY IS = " + nums[i] ) ;
     }
}
	
	