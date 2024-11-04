package com.muxue.interviewquestion.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.muxue.interviewquestion.model.entity.QuestionBank;
import com.muxue.interviewquestion.service.QuestionBankService;
import com.muxue.interviewquestion.mapper.QuestionBankMapper;
import org.springframework.stereotype.Service;

/**
* @author suzuriel
* @description 针对表【question_bank(题库)】的数据库操作Service实现
* @createDate 2024-11-04 00:06:43
*/
@Service
public class QuestionBankServiceImpl extends ServiceImpl<QuestionBankMapper, QuestionBank>
    implements QuestionBankService{

}




