package com.muxue.interviewquestion.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.muxue.interviewquestion.model.entity.Question;
import com.muxue.interviewquestion.service.QuestionService;
import com.muxue.interviewquestion.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author suzuriel
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-11-04 00:06:43
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




