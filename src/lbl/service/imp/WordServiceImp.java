package lbl.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import lbl.entry.Word;
import lbl.mapper.WordMapper;
import lbl.service.IWordService;

@Service
public class WordServiceImp implements IWordService{
	@Resource
	private WordMapper wordMapper;
	
	/**
	 * @param tableName
	 * @param id ǰ̨ҳ�洫������
	 * @return List<Word> 4����Ϣ 
	 */
	public List<Word> queryWord(int wechatid){
		return wordMapper.queryWord(wechatid);
	}
	
	public Word selectWord(String tableName,int id,int id1,int id2,int id3){
		return wordMapper.selectWord(tableName, id, id1, id2, id3);
	}
}

