package lbl.service;

import java.util.List;

import lbl.entry.Word;

public interface IWordService {
	public List<Word> queryWord(int wechatid);
	
	public Word selectWord(String tableName,int id,int id1,int id2,int id3);
}
