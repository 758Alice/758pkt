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
	 * 查询数据库中的单词并以json数据返回显示（优化代码）
	 * @author 彭康婷 int wechatid， String tableName,
	 * @param 接受前台传回的wechatid并wechatid查询用户表里进度，根据进度查询应该背的单词
	 * @return json数据
	 
	@RequestMapping("queryWord")
	@ResponseBody
	public List<Word> queryWord(int wechatid){
		List<Word> data = wordService.queryWord(wechatid);//int wechatid
		return data;
	}
	*/
	
	
	/**
	 * （未优化查询）
	 * @return
	 */
	@RequestMapping("selectWord")
	@ResponseBody
	public Word selectWord(int id){//int id上线改 参数id
		int id1 = (int)(1+Math.random()*1000);
		int id2 = (int)(1000+Math.random()*1000);
		int id3 = (int)(2000+Math.random()*1000);
		Word data = wordService.selectWord("cet_four", id, id1, id2, id3);
		return data;
	}
}