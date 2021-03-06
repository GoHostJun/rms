package com.cdvcloud.rms.dao;

import java.util.List;
import java.util.Map;

import org.bson.Document;

public interface IPresentationDao {

	public String insertMaterial(Map<String, Object> document);

	public Document queryOneDocument(String id);
	public Map<String, Object> queryOne(String id);

	public List<Map<String, Object>> query(Map<String, Object> sortFilter,Map<String, Object>  whereMap,int currentPage,int pageNum);
	
	public List<Map<String, Object>> query(Map<String, Object> sortFilter,Map<String, Object>  whereMap,Map<String, Object> backMap, int currentPage,int pageNum);
	public List<Map<String, Object>> query(Map<String, Object>  whereMap);

	public long  update(Map<String, Object> whereMap,Map<String, Object> set);
	public long  updateBySet(Map<String, Object> whereMap,Map<String, Object> set);

	public long  updateOne(String id,Map<String, Object> set,boolean option);
	
	public long  count(Map<String, Object> set);
	
	public long  delete(Map<String, Object> whereMap);
	
}
