public class TypeCastingTest {

	public static void main(String[] args) {

		byte by = 10;
		int in = by; // 묵시적 형 변환, 1byte짜리를 4byte에 넣음
		System.out.println("in " + in);

		int iVar = 100;
		byte bVar = (byte) iVar; // 명시적 형 변환, 4byte짜리를 1byte로 넣음. 명시적으로 해줘야함.
		System.out.println("bVar = " + bVar);

		iVar = 123456;
		bVar = (byte) iVar;
		System.out.println("bVar = " + bVar);
		//특수 문자
		System.out.println("\\");
		System.out.println("\'");
		System.out.println("\"");
		System.out.print("\t\n");
		//서식문자
		System.out.printf("%d\n",10);
		System.out.printf("%f\n",10.2f);
		System.out.printf("%c\n",'c');
		System.out.printf("%o\n",30);
		System.out.printf("%x\n",30);
		System.out.printf("%s\n","asd");
		//서식문자 정렬
		System.out.printf("%5d\n",123);
		System.out.printf("%5d\n",1234);
		System.out.printf("%5d\n",12345);
		//서식문자 소수점제한 기능
		System.out.printf("%f\n",1.23);
		System.out.printf("%.2f\n",1.23);
		System.out.printf("%.3f\n",1.23);
		System.out.printf("%.4f\n",1.23);
		System.out.printf("%.5f\n",1.23);
		System.out.println();
		int x=10;
		int y=20;
		System.out.println("x / y = "+ ((double)x/y));
		
		int result;
		result = (x>y)?100:200;
		System.out.println(result);
		result = (x<y)?100:200;
		System.out.println(result);
	}

}
