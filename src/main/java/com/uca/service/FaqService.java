package com.uca.service;


import com.uca.entity.Faq;
import com.uca.entity.FaqText;
import com.uca.entity.FaqType;

import java.util.List;

/**
 * @author
 * @ClassName FaqService
 * @date 2018-01-23
 * @time 17:28
 * @Description
 **/

public interface FaqService {

    /**
     * 添加分类信息
     */
    void faqTypeAdd(FaqType faqType);

    /**
     * 修改分类信息
     * @return
     */
    void updateById(FaqType faqType);

    /**
     * 删除分类信息
     * @return
     */
    void deleteFaqType(Integer id);

    List<FaqType> findFaqTypeShowAll();

    /**
     * 添加富文本
     */
    void richTextAdd(FaqText faqText);

    /**
     * 修改富文本
     */
    void updateRichText(FaqText faqText);

    /**
     * 查询富文本
     */
    FaqText richTextShow(FaqText faqText);

    /**
     * 添加问题
     */
    void faqAdd(Faq faq);

    /**
     * 删除问题
     */
    void deleteFaq(Integer id);

    /**
     * 修改问题
     */
    void updateFaq(Faq faq);

    /**
     * 查找问题列表
     */
    List<Faq> findFaqShow(Integer faqTypeId);
}
