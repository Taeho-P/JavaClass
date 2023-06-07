package class2023_05_11;

public class ArrayCopyExample {

	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		
		for(int i = 0; i < newStrArray.length; i++) {
			if(i < 3) {
			newStrArray[i + 2] = oldStrArray[i];
			}
			System.out.print(newStrArray[i] + ", ");
		}
		
		
//		System.arraycopy(oldStrArray, 0, newStrArray, 2, oldStrArray.length);
		
//		for (int i = 0; i < newStrArray.length; i++) {
//			System.out.print(newStrArray[i] + ", ");
//		}

	}

}
