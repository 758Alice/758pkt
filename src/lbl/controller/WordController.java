package lbl.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lbl.entry.Word;
import lbl.service.IWordService;

@Controller
@RequestMapping("word")
public class WordController{
	@Resource
	private IWordService wordService;
	
	/**
	 * ��ѯ���ݿ��еĵ��ʲ���json���ݷ�����ʾ���Ż����룩
	 * @author ���� int wechatid�� String tableName,
	 * @param ����ǰ̨���ص�wechatid��wechatid��ѯ�û�������ȣ����ݽ��Ȳ�ѯӦ�ñ��ĵ���
	 * @return json����
	 
	@RequestMapping("queryWord")
	@ResponseBody
	public List<Word> queryWord(int wechatid){
		List<Word> data = wordService.queryWord(wechatid);//int wechatid
		return data;
	}
	*/
	
	
	/**
	 * ��δ�Ż���ѯ��
	 * @return
	 */
	@RequestMapping("selectWord")
	@ResponseBody
	public Word selectWord(int id){//int id���߸� ����id
		int id1 = (int)(1+Math.random()*1000);
		int id2 = (int)(1000+Math.random()*1000);
		int id3 = (int)(2000+Math.random()*1000);
		Word data = wordService.selectWord("cet_four", id, id1, id2, id3);
		return data;
	}
}