package class2023_05_08;

public class Main2 {

	public static void main(String[] args) {
		
		int[] iNums = new int[6];
		
		boolean t = false;
					
		do {
			for(int i = 0; i < iNums.length; i++) {
				iNums[i] = (int) (Math.random() * 45) + 1;
			}
			
			
			if (iNums[0] == iNums [1] || iNums[0] == iNums[2] || iNums[0] == iNums[3] || iNums[0] == iNums[4] || iNums[0] == iNums[5]
						|| iNums[1] == iNums[2] || iNums[1] == iNums[3] || iNums[1] == iNums[4] || iNums[1] == iNums[5]
						|| iNums[2] == iNums[3] || iNums[2] == iNums[4] || iNums[2] == iNums[5]
						|| iNums[3] == iNums[4] || iNums[3] == iNums[5]
						|| iNums[4] == iNums[5]) {
				t = true; 
			}
		} while(t);
		
		System.out.print(iNums[0] + " " + iNums[1] + " " + iNums[2] + " " + iNums[3] + " " + iNums[4] + " " + iNums[5] + " ");
		
	}

}



