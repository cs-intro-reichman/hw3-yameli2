/** Functions for checking if a given string is an anagram. */
public class Anagram {
	public static void main(String args[]) {
		// Tests the isAnagram function.
		System.out.println(isAnagram("silent","listen"));  // true
		System.out.println(isAnagram("William Shakespeare","I am a weakish speller")); // true
		System.out.println(isAnagram("Madam Curie","Radium came")); // true
		System.out.println(isAnagram("Tom Marvolo Riddle","I am Lord Voldemort")); // true
		System.out.println(isAnagram("MMA","MA")); // FALSE

		// Tests the preProcess function.
		System.out.println(preProcess("What? No way!!!"));
		
		// Tests the randomAnagram function.
		System.out.println("silent and " + randomAnagram("entsli") + " are anagrams.");
		//silent
		// Performs a stress test of randomAnagram 
		String str = "1234567";
		Boolean pass = true;
		//// 10 can be changed to much larger values, like 1000
		for (int i = 0; i < 10; i++) {
			String randomAnagram = randomAnagram(str);
			System.out.println(randomAnagram);
			pass = pass && isAnagram(str, randomAnagram);
			if (!pass) break;
		}
		System.out.println(pass ? "test passed" : "test Failed");
	}  

	// Returns true if the two given strings are anagrams, false otherwise.
	public static boolean isAnagram(String str1, String str2) {
		if (str1=="" && str2=="")
		return true;
		str1=preProcess(str1);
		str2=preProcess(str2);
		boolean check = true;
		if (str1.length()==str2.length()){
		for(int i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!=' ')
				{
				for(int j=0;j<str2.length();j++)
				{
					if(str2.charAt(j)!=' '){
						if(str1.charAt(i)==str2.charAt(j))
						{
							j=str2.length();
							check=true;
						}
						else check=false;
					}	
				}
			    }
			}
			return check;
		}
		return false;
		//else{
		//	for(int i=0;i<str1.length();i++)
		//	{
				//if(str1.charAt(i)!=' ')
				//{
				//for(int j=0;j<str2.length();j++)
				//{
				//	if(str2.charAt(j)!=' '){
				//		if(str1.charAt(i)==str2.charAt(j))
				//		{
				//			j=str2.length();
				//			check=true;
				//		}
				//		else check=false;
				//	}	
				//}
			  //  }
			//}
			//return check;
		}
		
	
	
			
	
		
			

	// Returns a preprocessed version of the given string: all the letter characters are converted
	// to lower-case, and all the other characters are deleted, except for spaces, which are left
	// as is. For example, the string "What? No way!" becomes "whatnoway"
	public static String preProcess(String str) {
		if(str!=""){
		str=str.toLowerCase();
		String newstr="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97&&str.charAt(i)<=122)
			newstr+= str.charAt(i);
		}
		return newstr;	
	} 
	return "";
}


public static String preProcessWithSpaces(String str) {
	if(str!=""){
	str=str.toLowerCase();
	String newstr="";
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)>=97&&str.charAt(i)<=122||str.charAt(i)==' ')
		newstr+= str.charAt(i);
	}
	return newstr;	
} 
return "";
}
	// Returns a random anagram of the given string. The random anagram consists of the same
	// characters as the given string, re-arranged in a random order. 
	public static String randomAnagram(String str)
	{
        String newStr="";
        if(str!="")
    {
        for(int i=0;i<str.length();i++){
                double x= (Math.random()*(str.length()-1));
                newStr+=str.charAt((int)x);
                }
                return newStr;
        }
        return "";
    }
}

	
	

