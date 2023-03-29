package Recursion;
public class FactorialOf5Numbers {
	int fact= 1;
	public static void main(String[] args) {
		FactorialOf5Numbers fa = new FactorialOf5Numbers();
		int factResult = fa.factorial(5);
		System.out.println("factorial of first 5 number : " + factResult);
	}
	public int factorial(int no) {
		fact = fact * no;
		no--;
		if(no>0){
		   System.out.println(fact);
		   factorial(no);
	}
		return fact;
		}
}
