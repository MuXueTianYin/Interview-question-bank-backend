package com.muxue.interviewquestion.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.muxue.interviewquestion.model.entity.QuestionBankQuestion;

import com.muxue.interviewquestion.mapper.QuestionBankQuestionMapper;
import com.muxue.interviewquestion.service.QuestionBankQuestionService;
import org.springframework.stereotype.Service;

/**
* @author suzuriel
* @description 针对表【question_bank_question(题库题目)】的数据库操作Service实现
* @createDate 2024-11-04 00:06:43
*/
@Service
public class QuestionBankQuestionServiceImpl extends ServiceImpl<QuestionBankQuestionMapper, QuestionBankQuestion>
    implements QuestionBankQuestionService {

}




