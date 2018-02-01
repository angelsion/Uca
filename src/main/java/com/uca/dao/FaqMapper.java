package com.uca.dao;

import com.uca.entity.Faq;
import com.uca.entity.FaqText;
import com.uca.entity.FaqType;

import java.util.List;

/**
 * @author
 * @ClassName FaqMapper
 * @date 2018-01-23
 * @time 17:25
 * @Description
 **/

public interface FaqMapper {

    List<FaqType> selectShowAll();

    /**
     * 添加分类
     */
    int insertFaqType(FaqType faqType);

    /**
     * 修改分类
     */
    int updateById(FaqType faqType);

    /**
     * 删除分类
     */
    int deleteFaqType(Integer id);

    /**
     * 查询一级分类
     */
    List<FaqType> selectOneShow();

    /**
     * 查询对应的二级菜单
     */
    List<FaqType> selectTwoShow(Integer parentId);

    /**
     * 添加问题
     */
    int faqAdd(Faq faq);

    /**
     * 删除问题
     */
    int deleteFaq(Integer id);

    /**
     * 修改问题
     */
    int updateFaq(Faq faq);

    /**
     * 查询对应的问题列表
     */
    List<Faq> selectShowByFaqTypeId(Integer faqTypeId);

    /**
     * 添加富文本
     */
    int insertRichText(FaqText faqText);

    /**
     * 修改富文本
     */
    int updateRichText(FaqText faqText);

    /**
     * 删除富文本
     */
    int deleteRichText(Integer richTextId);

    /**
     * 根据faqTypeId和faqId查询富文本
     */
    FaqText selectFaqTextByFaqId(FaqText faqText);
}
