package com.phyling.service.system.createcode;

import java.util.List;

import com.phyling.entity.Page;
import com.phyling.util.PageData;

/**
 * 说明：代码生成器接口类
 * @author com.phyling ming
 * com.phyling
 */
public interface CreateCodeManager {
	
	/**新增
	 * @param pd
	 * @throws Exception
	 */
	public void save(PageData pd)throws Exception;
	
	/**删除
	 * @param pd
	 * @throws Exception
	 */
	public void delete(PageData pd)throws Exception;
	
	/**列表
	 * @param page
	 * @throws Exception
	 */
	public List<PageData> list(Page page)throws Exception;
	
	/**通过id获取数据
	 * @param pd
	 * @throws Exception
	 */
	public PageData findById(PageData pd)throws Exception;
	
	/**批量删除
	 * @param ArrayDATA_IDS
	 * @throws Exception
	 */
	public void deleteAll(String[] ArrayDATA_IDS)throws Exception;
	
	/**列表(主表)
	 * @param
	 * @throws Exception
	 */
	public List<PageData> listFa()throws Exception;
	
}
