package com.uca.controller;

import com.uca.common.web.JsonResult;
import com.uca.entity.Faq;
import com.uca.entity.FaqText;
import com.uca.entity.FaqType;
import com.uca.service.FaqService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author puyijun
 * @ClassName FaqController
 * @date 2018-01-23
 * @time 16:25
 * @Description 帮助中心
 **/
@CrossOrigin
@Controller
@RequestMapping("/Faq")
public class FaqController {

    @Resource
    private FaqService faqService;

    /**
     * 添加分类信息
     */
    @RequestMapping(value="/faqTypeAdd",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult faqTypeAdd(FaqType faqType){
        faqService.faqTypeAdd(faqType);
        return new JsonResult(true,"添加成功","");
    }

    /**
     * 修改分类信息
     */
    @RequestMapping(value="/updateFaqType",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult updateFaqType(FaqType faqType){
        faqService.updateById(faqType);
        return new JsonResult(true,"修改成功","");
    }

    /**
     * 删除分类信息
     */
    @RequestMapping(value="/deleteFaqType",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult deleteFaqType(FaqType faqType){
        faqService.deleteFaqType(faqType.getId());
        return new JsonResult(true,"删除成功","");
    }


    /**
     * 查询所有分类信息
     */
    @RequestMapping(value="/findFaqTypeShowAll",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult findFaqTypeShowAll(){
        List<FaqType> faqTypes =  faqService.findFaqTypeShowAll();

        return new JsonResult(true,"查询成功",faqTypes);
    }

    /**
     * 添加问题
     */
    @RequestMapping(value="/faqAdd",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult faqAdd(Faq faq){
        faqService.faqAdd(faq);
        return new JsonResult(true,"添加成功","");
    }

    /**
     * 删除问题
     */
    @RequestMapping(value="/deleteFaq",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult deleteFaq(Faq faq){
        faqService.deleteFaq(faq.getId());
        return new JsonResult(true,"删除成功","");
    }

    /**
     * 修改问题
     */
    @RequestMapping(value="/updateFaq",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult updateFaq(Faq faq){
        faqService.updateFaq(faq);
        return new JsonResult(true,"修改问题","");
    }

    /**
     * 查询所有问题
     */
    @RequestMapping(value="/findFaqShow",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult findFaqShow(Faq faq){
        List<Faq> list = faqService.findFaqShow(faq.getFaqTypeId());
        return new JsonResult(true,"查询成功",list);
    }



    /**
     * 添加富文本
     */
    @RequestMapping(value="/richTextAdd",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult richTextAdd(FaqText faqText){
        faqService.richTextAdd(faqText);
        return new JsonResult(true,"添加成功","");
    }

    /**
     * 修改富文本
     */
    @RequestMapping(value="/updateRichText",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult updateRichText(FaqText faqText){
        faqService.updateRichText(faqText);
        return new JsonResult(true,"修改成功","");
    }

    /**
     * 查询富文本
     */
    @RequestMapping(value="/findRichTextShow",method= RequestMethod.POST)
    @ResponseBody
    public JsonResult findRichTextShow(FaqText faqText){
        FaqText ft = faqService.richTextShow(faqText);
        return new JsonResult(true,"查询成功",ft);
    }
}
