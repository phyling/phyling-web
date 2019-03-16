package com.phyling.controller.system.tools;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.phyling.controller.base.BaseController;
import com.phyling.util.DelAllFile;
import com.phyling.util.FileDownload;
import com.phyling.util.Freemarker;
import com.phyling.util.PageData;
import com.phyling.util.PathUtil;

/**
 * 说明：系统工具
 * @author com.phyling ming
 * com.phyling
 */
@Controller
@RequestMapping(value="/tool")
public class ToolController extends BaseController {
	
	/**表单构建页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/goFormbuilder")
	public ModelAndView goFormbuilder() throws Exception{
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		mv.setViewName("system/tools/form_builder");
		mv.addObject("pd", pd);
		return mv;
	}
	
	/**生成文件并下载（生成的表单构建页面代码放到jsp页面）
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/downloadFormCode")
	public void downloadFormCode(HttpServletResponse response) throws Exception{
		PageData pd = new PageData();
		pd = this.getPageData();
		Map<String,Object> root = new HashMap<String,Object>();		//创建数据模型
		root.put("htmlCode", pd.getString("htmlCode"));
		DelAllFile.delFolder(PathUtil.getClasspath()+"admin/ftl"); //生成代码前,先清空之前生成的代码
		String filePath = "admin/ftl/code/";						//存放路径
		String ftlPath = "createCode";								//ftl路径
		/*生成controller*/
		Freemarker.printFile("newJsp.ftl", root, "newJsp.jsp", filePath, ftlPath);
		FileDownload.fileDownload(response, PathUtil.getClasspath()+"admin/ftl/code/newJsp.jsp", "newJsp.jsp");
	}
	
}
// 创建人：FH Q313596790