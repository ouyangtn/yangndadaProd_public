package com.oyjl.yangdada.model.dto.userAnswer;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 更新用户答案请求
 *
 * @author <a href="https://github.com/ouyangtn">程序员红逗</a>
 * @from <a href="https://github.com/ouyangtn">程序员红逗的github</a>
 */
@Data
public class UserAnswerUpdateRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 应用 id
     */
    private Long appId;

    /**
     * 用户答案（JSON 数组）
     */
    private List<String> choices;

    private static final long serialVersionUID = 1L;
}