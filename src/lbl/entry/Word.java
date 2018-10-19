package lbl.entry;
/**
 * 实体类：单词,对应数据库相应的表名
 * @author 彭康婷
 */
public class Word {
	private int id;
	private String word ;
	private String answer ;
	private String error1;
	private String error2;
	private String error3;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getError1() {
		return error1;
	}
	public void setError1(String error1) {
		this.error1 = error1;
	}
	public String getError2() {
		return error2;
	}
	public void setError2(String error2) {
		this.error2 = error2;
	}
	public String getError3() {
		return error3;
	}
	public void setError3(String error3) {
		this.error3 = error3;
	}
	@Override
	public String toString() {
		return "Word [id=" + id + ", word=" + word + ", answer=" + answer + ", error1=" + error1 + ", error2=" + error2
				+ ", error3=" + error3 + "]";
	}
	
}


  
