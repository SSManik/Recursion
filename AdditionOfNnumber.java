package Recursion;
public class AdditionOfNnumber {
	int total=0;
public static void main(String[] args) {
	AdditionOfNnumber add = new AdditionOfNnumber();
	int result = add.addition(5);
	  System.out.println("Addition of first 5 number is : " + result);
}
public int addition(int number) {
	total = total + number;
	number--;
	if(number>=0){
	System.out.println(total);
	addition(number);
		}
	return total;
	}
}
