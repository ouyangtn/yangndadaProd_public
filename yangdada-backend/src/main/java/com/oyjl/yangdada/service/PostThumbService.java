package com.oyjl.yangdada.service;

import com.oyjl.yangdada.model.entity.PostThumb;
import com.baomidou.mybatisplus.extension.service.IService;
import com.oyjl.yangdada.model.entity.User;

/**
 * 帖子点赞服务
 *
 * @author <a href="https://github.com/ouyangtn">程序员红逗</a>
 * @from <a href="https://github.com/ouyangtn">程序员红豆的github</a>
 */
public interface PostThumbService extends IService<PostThumb> {

    /**
     * 点赞
     *
     * @param postId
     * @param loginUser
     * @return
     */
    int doPostThumb(long postId, User loginUser);

    /**
     * 帖子点赞（内部服务）
     *
     * @param userId
     * @param postId
     * @return
     */
    int doPostThumbInner(long userId, long postId);
}
