
public class StringClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("asd");
		String str1 ="asdf";
		
		System.out.println(str +" "+ str1);
		String str2 = str1 +"aaaa";
		System.out.println(str+str1);
		System.out.println(str.concat(str1));
		System.out.println(str2);
		
		/////
		String str3 = String.valueOf(3.14f); //부동소수점
		System.out.println(str3);
		String[] strArr = {"1","2","3","4"};
		System.out.println(strArr.length);
	}

}
