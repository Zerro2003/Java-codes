// A simple while loop example in Java
public class simpleLoop {
	public static void main(String[] args) {
		int i =1;
        while(i<=10){
            for(int j=1;j<=10;j++){
                System.out.print(j + " * " + i + " = " + (j*i) + "\t");
            }
            i++;
        }
	}
}