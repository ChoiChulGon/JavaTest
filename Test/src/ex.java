public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book JavaBook= new Book();
		JavaBook.SetTitle("a little rabbit");
		JavaBook.SetPublisher("Yellow");
		JavaBook.SetPage(300);
		
		System.out.println("java page number : "+JavaBook.m_npage);
		System.out.println("java book title : "+JavaBook.GetTitle());
		
	}
}

class Book {
	String m_strTitle; // 책 제목
	int m_npage; // 페이지
	String m_strPublisher; // 출판사
	int m_nPrice; // 가격
	
	void SetTitle(String strTitle) {
		m_strTitle = strTitle;
	}
	
	String GetTitle() {
		return m_strTitle;
	}
	
	void SetPage(int page) {
		m_npage = page;
	}
	
	int GetPage() {
		return m_npage;
	}
	
	void SetPublisher(String Publisher) {
		m_strPublisher = Publisher;
	}
}
