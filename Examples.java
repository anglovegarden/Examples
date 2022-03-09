public class Examples{
	public static void main(String[] argos){
		Decision dec = new Decision("switch");
		Iterative it = new Iterative("for loop");
		Array arr = new Array();
		dec.run();
		it.run();
		arr.run();
	}
}
