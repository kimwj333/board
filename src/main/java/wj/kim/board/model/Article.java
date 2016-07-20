package wj.kim.board.model;

public class Article {
	private int articleNo;
	private String articleTitle;
	private String articleContent;
	private String articlePw;
	private String articleDate;
	private String articleWriter;
	
	public int getArticleNo() {
		return articleNo;
	}
	public void setArticleNo(int articleNo) {
		this.articleNo = articleNo;
	}
	public String getArticleTitle() {
		return articleTitle;
	}
	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}
	public String getArticleContent() {
		return articleContent;
	}
	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}
	public String getArticlePw() {
		return articlePw;
	}
	public void setArticlePw(String articlePw) {
		this.articlePw = articlePw;
	}
	public String getArticleDate() {
		return articleDate;
	}
	public void setArticleDate(String articleDate) {
		this.articleDate = articleDate;
	}
	public String getArticleWriter() {
		return articleWriter;
	}
	public void setArticleWriter(String articleWriter) {
		this.articleWriter = articleWriter;
	}
	
	@Override
	public String toString() {
		return "article [articleNo=" + articleNo + ", articleTitle=" + articleTitle + ", articleContent="
				+ articleContent + ", articlePw=" + articlePw + ", articleDate=" + articleDate + ", articleWriter="
				+ articleWriter + "]";
	}
	
}
