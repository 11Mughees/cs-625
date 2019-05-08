class MultiD {
	public static void main(String args[]) {
		int md[][] = new int[3] [4] ;
		int i, j ;
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				md[i][j] = (i*2)+i+1 ;
				System.out.print(md[i][j] + " ") ;
			}
			System.out.println();
		}
	}
}