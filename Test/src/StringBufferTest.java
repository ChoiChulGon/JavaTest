
public class StringBufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		String str1 = "zxc";
		sb.append(str1);
		System.out.println(sb + " 문자열 길이 : "+ sb.length());
		
		StringBuffer sb1 = new StringBuffer(1);
		
		sb1.append("a");
		System.out.println(sb1 + " 문자열 길이 : "+ sb1.length());
		
		///////////
		System.out.println();
		StringBuffer sb2 = new StringBuffer(210);
		sb2.append("test.txt");
		System.out.println(sb2);
		
		sb2.delete(0, sb2.length()-4);
		sb2.insert(0, "sucess");
		System.out.println(sb2);
	}

}
