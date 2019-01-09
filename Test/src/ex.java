public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book JavaBook = new Book();
		OverLoadTest OLT = new OverLoadTest();
		JavaBook.SetTitle("a little rabbit");
		JavaBook.SetPublisher("Yellow");
		JavaBook.SetPage(300);

		//System.out.println("java page number : " + JavaBook.GetPage());
		//System.out.println("java book title : " + JavaBook.GetTitle());
		System.out.println("Add(int nVar1, int nVar2, int nVar3) = "+OLT.Add(1,2,3));
		System.out.println(OLT.Add(34, 56));
		System.out.println(OLT.Add(3.3f, 1.1f, 5.5f));
	}
}

class Book {
	private String m_strTitle; // 책 제목
	private int m_npage; // 페이지
	private String m_strPublisher; // 출판사
	private int m_nPrice; // 가격

	public void SetTitle(String strTitle) {
		m_strTitle = strTitle;
	}

	public String GetTitle() {
		return m_strTitle;
	}

	public void SetPage(int page) {
		m_npage = page;
	}

	public int GetPage() {
		return m_npage;
	}

	public void SetPublisher(String Publisher) {
		m_strPublisher = Publisher;
	}
}

class OverLoadTest{
	public int Add(int nVar1, int nVar2) {
		return nVar1 + nVar2;
	}
	
	public float Add(float fVar1, float fVar2, float fVar3) {
		return fVar1+fVar2+fVar3;
	}
	public int Add(int nVar1, int nVar2, int nVar3) {
		return nVar1 + nVar2 + nVar3;
	}
}