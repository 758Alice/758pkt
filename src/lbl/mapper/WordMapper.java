package lbl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import lbl.entry.Word;

/**
 * ���ݱ�����ͬ��ѯ���ݿ��еĵ���
 * @author ����
 * @param ǰ�˴��ص�wechatid
 * @return List<Word>4������
 */
public interface WordMapper {
	public List<Word> queryWord(@Param("wechatid")int wechatid);
	
	public Word selectWord(@Param("tableName")String tableName,@Param("id")int id,@Param("id1")int id1,@Param("id2")int id2,@Param("id3")int id3);
}
