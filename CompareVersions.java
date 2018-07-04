// https://leetcode.com/problems/compare-version-numbers/description/
public class CompareVersions {

	public static void main(String[] args) {
		String version1 = "1.0.1";
		String version2 = "1";
		
		System.out.println(compare(version1, version2));
	}
	
	private static int compare(String version1, String version2) {
		
		String[] version1Array = version1.split("\\.");
		String[] version2Array = version2.split("\\.");
		
		int shortest = (version1Array.length < version2Array.length)
				? version1Array.length : version2Array.length;
		
		for (int i = 0; i < version2Array.length; i++) {
			if(compareTwoIntegers(Integer.parseInt(version1Array[i]), 
					Integer.parseInt(version2Array[i])) == 1)
				return 1;
			if(compareTwoIntegers(Integer.parseInt(version1Array[i]), 
					Integer.parseInt(version2Array[i])) == -1)
				return -1;
		}
		String[] temp = (version1Array.length < version2Array.length) 
						? version2Array : version2Array;
		
		longerLengthComparison(version1Array, version2Array);
		
		
		return 0;
		
	}

	private static int compareTwoIntegers(int parseInt1, int parseInt2) {
		if(parseInt1 == parseInt2)
			return 0;
		else if(parseInt1 > parseInt2)
			return 1;
		else 
			return -1;
		
	}

}
