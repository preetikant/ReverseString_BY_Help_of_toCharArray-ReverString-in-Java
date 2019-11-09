class ReverseString{
	public static void main(String[] args) {
		String str = "PreetiKant";
		char[] strAsCharArray = str.toCharArray();
		for (int i=strAsCharArray.length-1;i>=0;i--) 
			System.out.print(strAsCharArray[i]);
		
	}
}