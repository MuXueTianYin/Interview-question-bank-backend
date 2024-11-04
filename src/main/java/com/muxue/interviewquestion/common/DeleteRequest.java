package com.muxue.interviewquestion.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
 * @author <a href="https://github.com/MuXueTianYin">暮雪天音</a>
 * @from <a href="https://www.muxuetianyin.cn/">muxuetianyin</a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}