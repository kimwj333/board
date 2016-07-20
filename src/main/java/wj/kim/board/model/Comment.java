package wj.kim.board.model;

public class Comment {
	private int commentNo;
	private String commentContent;
	private String commentPw;
	private String commentWriter;
	
	public int getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public String getCommentPw() {
		return commentPw;
	}
	public void setCommentPw(String commentPw) {
		this.commentPw = commentPw;
	}
	public String getCommentWriter() {
		return commentWriter;
	}
	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}
	
	@Override
	public String toString() {
		return "comment [commentNo=" + commentNo + ", commentContent=" + commentContent + ", commentPw=" + commentPw
				+ ", commentWriter=" + commentWriter + "]";
	}
	
}
