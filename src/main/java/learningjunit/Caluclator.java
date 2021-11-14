package learningjunit;

public class Caluclator {
	public static void main(String[] args) {
		int  added =add(3,4);
		System.out.println(added);

	}
	public static int add(int a,int b) {
		System.out.println("Changed from github");
		return a+b;
		//added new comment two
		System.out.println("Added in local");
		System.out.println("changed in local");
		System.out.println("again Added in local");

	}

}
