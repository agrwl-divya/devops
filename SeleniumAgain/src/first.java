
public class first{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Pracccctice";
		String s2="PPPractice";
		
		
		System.out.println(s1);
		System.out.println(s1.charAt(2));
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.substring(4, 7));
		System.out.println(s1.replace('P','R'));
		System.out.println(s1);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.replace('P','R'));
		System.out.println(s1.contains(s2));
		System.out.println(s2.contains(s1));
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		String s3="1";
		String s4="2";
		System.out.println(s3+s4); //in case of integer string + operator adds
		
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.toUpperCase().equals(s2));
		System.out.println(s1.startsWith("R"));
		System.out.println(s1.trim());//trims space from start and end
		
		String s5="ja  va";
		System.out.println(s5);
		System.out.println(s5.split(" "));
		
		
	}

}
