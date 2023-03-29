package Recursion;
public class PrintNumber {
 public static void main(String[] args) {
	PrintNumber obj = new PrintNumber();
	obj.display(1);
}
public void display(int number) {
	if(number<=10){
		System.out.println(number);
		number++;
		display(number);
	}
  }
}
 