
public class Session2Assignment3 {
	/*
	 * Write a code using loops to print following pattern.
	 */
	public static void main(String[] args) {

		int loop = 1;
		boolean max = false;
		while(loop > 0){
			for(int i = 0; i < loop; i++){
				System.out.print(i+1);
			}
			System.out.println();
			if (loop == 5) 
				max = true;
			
			if (max == false)
				loop++;
			else loop--;
		}

	}

}
