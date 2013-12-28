
public class test {
	public static void main(String[] args){
		Arrayqueue<String> test=new Arrayqueue<String>(15);
		test.enqueue( "The" );
		System.out.println(test.toString());
	    test.enqueue( "quick" );
	    System.out.println(test.toString());
	    test.enqueue( "brown" );
	    System.out.println(test.toString());
	    test.enqueue( "fox" );
	    System.out.println(test.toString());
	    test.dequeue();
	    System.out.println(test.toString());
	}
}
