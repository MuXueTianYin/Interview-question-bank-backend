package com.muxue.interviewquestion.model.dto.questionBank;

import com.muxue.interviewquestion.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询题库请求
 *
 * @author <a href="https://github.com/MuXueTianYin">暮雪天音</a>
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionBankQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * id
     */
    private Long notId;

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 标题
     */
    private String title;


    /**
     * 描述
     */
    private String description;
    /**
     * 图片
     */
    private String picture;

    /**
     * 创建用户 id
     */
    private Long userId;


    /**
    *   是否要查询关联题目列表
    * */
    private boolean  needQueryQuestionList;


    private static final long serialVersionUID = 1L;

}