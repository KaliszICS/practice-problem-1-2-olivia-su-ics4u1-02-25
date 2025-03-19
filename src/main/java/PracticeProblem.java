public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex (int[] array, int index){
		try{
			int valid = array[index];
			return true;
		}catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
		
	}

	public static int divide (int num, int num2){
		try{
			int ans = (num/num2);
			return ans;
		}catch(ArithmeticException e){
			return 0;

		}
	}

	public static int safeConvertStringtoInt (String word){
		try{
			int num = Integer.parseInt(word);
			return num; 

		}catch (NumberFormatException e){
			return 0;
		}
	}

	// Hi Mr.Kalisz

}
