package com.oyjl.yangdada.model.dto.question;

import lombok.Data;

/**
 * 题目答案封装类（用于 AI 评分）
 *
 * @author <a href="https://github.com/ouyangtn">程序员红逗</a>
 * @from <a href="https://github.com/ouyangtn">程序员红逗的github</a>
 */
@Data
public class QuestionAnswerDTO {

    /**
     * 题目
     */
    private String title;

    /**
     * 用户答案
     */
    private String userAnswer;
}
