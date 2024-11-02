package com.oyjl.yangdada.controller;

import cn.hutool.core.io.FileUtil;
import com.oyjl.yangdada.common.BaseResponse;
import com.oyjl.yangdada.common.ErrorCode;
import com.oyjl.yangdada.common.ResultUtils;
import com.oyjl.yangdada.constant.FileConstant;
import com.oyjl.yangdada.exception.BusinessException;
import com.oyjl.yangdada.exception.ThrowUtils;
import com.oyjl.yangdada.manager.CosManager;
import com.oyjl.yangdada.mapper.UserAnswerMapper;
import com.oyjl.yangdada.model.dto.file.UploadFileRequest;
import com.oyjl.yangdada.model.dto.statistic.AppAnswerCountDTO;
import com.oyjl.yangdada.model.dto.statistic.AppAnswerResultCountDTO;
import com.oyjl.yangdada.model.entity.User;
import com.oyjl.yangdada.model.enums.FileUploadBizEnum;
import com.oyjl.yangdada.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * App 统计分析接口
 *
 * @author <a href="https://github.com/ouyangtn">程序员红逗</a>
 * @from <a href="https://github.com/ouyangtn">程序员红豆的github</a>
 */
@RestController
@RequestMapping("/app/statistic")
@Slf4j
public class AppStatisticController {

    @Resource
    private UserAnswerMapper userAnswerMapper;

    /**
     * 热门应用及回答数统计（top 10）
     *
     * @return
     */
    @GetMapping("/answer_count")
    public BaseResponse<List<AppAnswerCountDTO>> getAppAnswerCount() {
        return ResultUtils.success(userAnswerMapper.doAppAnswerCount());
    }

    /**
     * 某应用回答结果分布统计
     *
     * @param appId
     * @return
     */
    @GetMapping("/answer_result_count")
    public BaseResponse<List<AppAnswerResultCountDTO>> getAppAnswerResultCount(Long appId) {
        ThrowUtils.throwIf(appId == null || appId <= 0, ErrorCode.PARAMS_ERROR);
        return ResultUtils.success(userAnswerMapper.doAppAnswerResultCount(appId));
    }
}