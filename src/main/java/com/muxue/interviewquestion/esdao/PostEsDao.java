package com.muxue.interviewquestion.esdao;

import com.muxue.interviewquestion.model.dto.post.PostEsDTO;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * 帖子 ES 操作
 *
 * @author <a href="https://github.com/MuXueTianYin">暮雪天音</a>
 * @from <a href="https://www.muxuetianyin.cn/">muxuetianyin</a>
 */
public interface PostEsDao extends ElasticsearchRepository<PostEsDTO, Long> {

    List<PostEsDTO> findByUserId(Long userId);
}