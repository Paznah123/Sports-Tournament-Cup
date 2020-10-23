
public class g {
	public static void main(String[] args) {
		//abSubGroups(4);
		//System.out.println(polyndrom("kak"));
		int num = 0;
		System.out.println(reverseNum(1984, num));
	}

	
///////////////////////////////////////////////////// 

	static void abSubGroups(int num) {
		String str = "";
		abHelper(str, num);
	}
	
	static void abHelper(String string, int num) {
		if(num == 0) {
			System.out.println(string);
			return;
		} else if (num == 1) {
			System.out.println(string + "a");
			System.out.println(string + "b");
			return;
		} else {
			abHelper(string + "ab", num-2);
			abHelper(string + "b", num-1);
		}
	}
	
///////////////////////////////////////////////////// 

	static boolean polyndrom(String str) {
		if(str.length() < 2)
			return true;
		char firstChar = str.charAt(0);
		char lastChar = str.charAt(str.length()-1);
		if(firstChar != lastChar)
			return false;
		else
			return polyndrom(str.substring(1, str.length()-1));
	}
	
///////////////////////////////////////////////////// 

	static int reverseNum(int num, int reverNum) {
		reverNum = (num%10)*10;
		
		int newNum = reverseNum(num/10, reverNum);
		
		return newNum;
	}
}
