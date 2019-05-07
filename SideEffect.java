class SideEffect {
  public static void main(String args [] ) {
     int i;
     i = 0;
     if(false & (++i < 100))
        System.out.println("This won't be displayed");
     System.out.println("if statement executed: " + i);
     if(false && (++i < 100))
        System.out.println("This won't be displayed");
     System.out.println("if statement executed: " + i);
    }
}