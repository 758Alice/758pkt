package lbl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lbl.entry.Word;

/**
 * 根据表名不同查询数据库中的单词
 * @author 彭康婷
 * @param 前端传回的wechatid
 * @return List<Word>4条数据
 */
public interface WordMapper {
	public List<Word> queryWord(@Param("wechatid")int wechatid);
	
	public Word selectWord(@Param("tableName")String tableName,@Param("id")int id,@Param("id1")int id1,@Param("id2")int id2,@Param("id3")int id3);
}
