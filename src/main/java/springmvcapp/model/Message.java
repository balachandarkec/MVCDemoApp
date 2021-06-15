package springmvcapp.model;

public class Message {
	private int id;
	private String content;
	private String createdDate;
	
	public Message() {
		
	}

	public Message(int id, String content, String createdDate) {
		super();
		this.id = id;
		this.content = content;
		this.createdDate = createdDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", createdDate=" + createdDate + "]";
	}
	
	

}
