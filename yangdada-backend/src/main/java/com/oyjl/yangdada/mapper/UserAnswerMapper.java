package com.oyjl.yangdada.mapper;

import com.oyjl.yangdada.model.dto.statistic.AppAnswerCountDTO;
import com.oyjl.yangdada.model.dto.statistic.AppAnswerResultCountDTO;
import com.oyjl.yangdada.model.entity.UserAnswer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author oyjl
* @description 针对表【user_answer(用户答题记录)】的数据库操作Mapper
* @createDate 2024-05-09 20:41:03
* @Entity com.oyjl.yangdada.model.entity.UserAnswer
*/
public interface UserAnswerMapper extends BaseMapper<UserAnswer> {

    @Select("select appId, count(userId) as answerCount from user_answer\n" +
            "    group by appId order by answerCount desc limit 10;")
    List<AppAnswerCountDTO> doAppAnswerCount();


    @Select("select resultName, count(resultName) as resultCount from user_answer\n" +
            "    where appId = #{appId}\n" +
            "    group by resultName order by resultCount desc;")
    List<AppAnswerResultCountDTO> doAppAnswerResultCount(Long appId);
}