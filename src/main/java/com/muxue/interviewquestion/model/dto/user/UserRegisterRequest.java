package com.muxue.interviewquestion.model.dto.user;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户注册请求体
 *
 * @author <a href="https://github.com/MuXueTianYin">暮雪天音</a>
 * @from <a href="https://www.muxuetianyin.cn/">muxuetianyin</a>
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
