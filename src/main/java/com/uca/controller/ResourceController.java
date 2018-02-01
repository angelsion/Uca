package com.uca.controller;

import com.uca.common.web.JsonResult;
import com.uca.entity.Resource;
import com.uca.entity.SourceType;
import com.uca.service.ResourceService;
import com.uca.service.TokenManager;
import com.uca.service.UserService;
import com.uca.utils.MimeTypeUtil;
import com.uca.utils.UtilDate;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

/**
 * ClassName: SourceController 
 * @Description: 资源管理拦截器
 * @author puyijun
 * @date 2018-01-23
 */
@CrossOrigin
@Controller
@RequestMapping("/Resource")
public class ResourceController {

	@javax.annotation.Resource
	private ResourceService resourceService;
	@javax.annotation.Resource
    private TokenManager tokenManager;
	@javax.annotation.Resource
    private UserService userService;
	
	/**
	 * 资源上传
	 * @throws Throwable 
	 */
	@RequestMapping(value="/ResourceAdd",method= RequestMethod.POST,produces="text/html;charset=utf-8")
	public void springUpload(HttpServletResponse response,
			HttpServletRequest request) throws Throwable {
		/* 获取文件描述参数 */
		String fileDesc = request.getParameter("fileDesc");
		
		List<Resource> resources = new ArrayList<Resource>();
		
		/* 将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）*/
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
				request.getSession().getServletContext());
		
		/* 检查form中是否有enctype="multipart/form-data" */
		if(multipartResolver.isMultipart(request)) {
			/* 将request变成多部分request */
			MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
			
			/* 获取multiRequest 中所有的文件名*/
			Iterator iter=multiRequest.getFileNames();
			String timedate  = UtilDate.getOrderNum();	// 时间戳,避免文件覆盖
			
			while(iter.hasNext()) {
				
				//一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
                if(file != null) {

                	/* 文件属性获取 */
					SourceType sourceType = MimeTypeUtil.getSourceType(file.getContentType());

                    // 获得项目的路径
                    ServletContext sc = request.getSession().getServletContext();

                    System.out.println("sc："+sc);

                    // 上传位置
                    String path = sc.getRealPath("/img") + "/"; // 设定文件保存的目录
                    // 获得原始文件名
                    String fileName = file.getOriginalFilename();
                    // 新文件名
                    String newFileName = UUID.randomUUID() + fileName;
                    try {
                        FileOutputStream fos = new FileOutputStream(path + newFileName);
                        InputStream in = file.getInputStream();
                        int b = 0;
                        while ((b = in.read()) != -1) {
                            fos.write(b);
                        }
                        fos.close();
                        in.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    /* 保存上传的文件属性 */
					Resource r = new Resource();
					r.setResourcename(newFileName);
					r.setResourcepath(path+newFileName);
					if (StringUtils.isNotBlank(fileDesc)) {
						r.setResourcedesc(fileDesc);
					}
					r.setResourcetypeid(Integer.parseInt(sourceType.getSourceTypeId()));
					// 添加资源记录
					resourceService.resourceAdd(r);
					resources.add(r);
                }
            }
        }
        
        /* 返回上传结果 */
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/x-json;charset=UTF-8");
        /* 解决文件上传跨域问题 */
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("origin"));
        JSONObject jsObject =JSONObject.fromObject(new JsonResult(true, "文件上传成功", resources));
        
        response.getWriter().write(jsObject.toString());
    }
	
	/**
	 * 资源信息修改
	 */
	@RequestMapping(value="/ResourceUpdate",method= RequestMethod.POST)
	public JsonResult fileUpdate(Resource resource) throws Throwable{
		
		int result = resourceService.resourceUpdate(resource);
		
		return new JsonResult(true,"修改资源信息成功", result);
	}
	
	/**
	 * 资源删除
	 */
	/*@RequestMapping(value="/ResourceDel",method= RequestMethod.GET)
	public JsonResult fileDelete(@CurrentUser User login, 
			@Validated(value={ResourceIdValid.class}) Resource resource,
			BindingResult br) throws Throwable {
		
		*//* 需要校验的字段 *//*
		String [] validateParam = {"resourceid"};
		*//* 存放校验错误结果集 *//*
		Map<String, String> errorMap = ValidateUtil.getErrorMap(br, validateParam);
		if(errorMap != null && errorMap.size() != 0) {
			*//* 返回参数校验错误详情 *//*
			return new JsonResult(false, "修改资源信息参数错误", errorMap);
		}
		
		Resource r = resourceService.resourceShowById(resource.getResourceid());
		
		*//* 删除资源 *//*
		OSSManageUtil.deleteFile(OSSConfigure.getOssConfig(), r.getResourcepath());
		
		int result = resourceService.resourceDel(resource.getResourceid());
		
		return new JsonResult(true,"删除资源信息成功",null);
	}*/
	
	/**
	 * 资源信息查询
	 */
	@RequestMapping(method= RequestMethod.GET)
    @ResponseBody
	public JsonResult fileShow(Resource resource) throws Throwable{


		Resource r = resourceService.resourceShowById(resource.getResourceid());
		if (r == null) {
			return new JsonResult(false, "该资源id信息不存在", "");
		}
		
		return new JsonResult(true,"查询资源信息成功",r);
	}

}
