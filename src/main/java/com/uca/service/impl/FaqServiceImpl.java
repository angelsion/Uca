package com.uca.service.impl;

import com.uca.dao.FaqMapper;
import com.uca.entity.Faq;
import com.uca.entity.FaqText;
import com.uca.entity.FaqType;
import com.uca.service.FaqService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author puyijun
 * @ClassName FaqServiceImpl
 * @date 2018-01-23
 * @time 17:29
 * @Description 帮助分类业务实现
 **/

@Transactional
@Service("faqService")
public class FaqServiceImpl implements FaqService {

    @Resource
    private FaqMapper faqMapper;

    /**
     * 添加分类信息
     *
     * @param faqType
     */
    @Override
    public void faqTypeAdd(FaqType faqType) {
        int rows = faqMapper.insertFaqType(faqType);
        if (rows == -1){
            throw new RuntimeException("添加失败");
        }
    }

    /**
     * 修改分类信息
     *
     * @param faqType
     * @return
     */
    @Override
    public void updateById(FaqType faqType) {
        int rows = faqMapper.updateById(faqType);
        if (rows == -1){
            throw new RuntimeException("修改失败");
        }
    }

    /**
     * 删除分类信息
     *
     * @param id
     * @return
     */
    @Override
    public void deleteFaqType(Integer id) {
        //查询有没有下级分类
        List<FaqType> faqTypes = faqMapper.selectTwoShow(id);
        if (faqTypes.isEmpty()){
            int rows = faqMapper.deleteFaqType(id);
            if (rows == -1){
                throw new RuntimeException("删除失败");
            }
        }else {
            throw new RuntimeException("该目录有下级分类，请先删除下级分类");
        }

    }

    @Override
    public List<FaqType> findFaqTypeShowAll() {

        List<FaqType> faqTypeOne = faqMapper.selectOneShow();
        for (FaqType f:faqTypeOne
             ) {
            List<FaqType> list2 = faqMapper.selectTwoShow(f.getId());
            f.setFaqTypeTwo(list2);
        }
        return faqTypeOne;
    }

    /**
     * 添加富文本
     * @param faqText
     */
    @Override
    public void richTextAdd(FaqText faqText) {
        int rows = faqMapper.insertRichText(faqText);
        if (rows == -1) {
            throw new RuntimeException("添加失败");
        }
    }

    /**
     * 修改富文本
     *
     * @param faqText
     */
    @Override
    public void updateRichText(FaqText faqText) {
        int rows = faqMapper.updateRichText(faqText);
        if (rows == -1){
            throw new RuntimeException("修改失败");
        }
    }

    /**
     * 查询富文本
     *
     * @param faqText
     */
    @Override
    public FaqText richTextShow(FaqText faqText) {
        return faqMapper.selectFaqTextByFaqId(faqText);
    }

    /**
     * 添加问题
     *
     * @param faq
     */
    @Override
    public void faqAdd(Faq faq) {
        int rows = faqMapper.faqAdd(faq);
        if (rows == -1){
            throw new RuntimeException("添加失败");
        }
    }

    /**
     * 删除问题
     */
    @Override
    public void deleteFaq(Integer id) {
        int rows = faqMapper.deleteFaq(id);
        if (rows == -1){
            throw new RuntimeException("删除失败");
        }
        /* 删除富文本 */


    }

    /**
     * 修改问题
     */
    @Override
    public void updateFaq(Faq faq) {
        int rows = faqMapper.updateFaq(faq);
        if (rows == -1){
            throw new RuntimeException("修改失败");
        }
    }

    /**
     * 查找问题列表
     *
     * @param faqTypeId
     */
    @Override
    public List<Faq> findFaqShow(Integer faqTypeId) {
        return faqMapper.selectShowByFaqTypeId(faqTypeId);
    }

}
